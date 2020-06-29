package com.epam.bookcatalogservice.controller;

import com.epam.bookcatalogservice.model.Book;
import com.epam.bookcatalogservice.model.Catalog;
import com.epam.bookcatalogservice.model.CatalogItem;
import com.epam.bookcatalogservice.model.UserRating;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class BookCatalogResource {

    private final RestTemplate restTemplate;

    public BookCatalogResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/{userId}", produces={"application/json"})
    public ResponseEntity<Catalog> getCatalog(@PathVariable("userId") String userId) {
        UserRating ratings = restTemplate.getForObject("http://book-rating-service/bookratings/users/" + userId, UserRating.class);
        Catalog catalog = new Catalog();
        catalog.setCatalogList( getCatalogItems(ratings));
        return ResponseEntity.ok(catalog);
    }

    private List<CatalogItem> getCatalogItems(UserRating ratings) {
        return ratings.getUserRating().stream().map(rating -> {
                Book book = restTemplate.getForObject("http://book-info-service/books/" + rating.getBookId(), Book.class);
                return new CatalogItem(book.getTitle(), "description", rating.getRatings());
            }).collect(Collectors.toList());
    }


}
