package com.epam.bookcatalogservice.model;

import java.util.List;

public class UserRating {

    private List<BookRatingsData> userRating;

    public UserRating(){}

    public UserRating(List<BookRatingsData> userRating) {
        this.userRating = userRating;
    }

    public List<BookRatingsData> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<BookRatingsData> userRating) {
        this.userRating = userRating;
    }
}
