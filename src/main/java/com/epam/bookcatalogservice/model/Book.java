package com.epam.bookcatalogservice.model;

public class Book {

    private String bookId;

    private String title;

    private String description;

    public Book(){}

    public Book(String bookId, String title, String description) {
        this.bookId = bookId;
        this.title = title;
        this.description = description;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
