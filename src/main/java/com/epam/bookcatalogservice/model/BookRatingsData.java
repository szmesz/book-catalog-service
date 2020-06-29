package com.epam.bookcatalogservice.model;

public class BookRatingsData {

    private String bookId;

    private String title;

    private double ratings;

    public BookRatingsData(){}

    public BookRatingsData(String bookId, String title, double ratings) {
        this.bookId = bookId;
        this.title = title;
        this.ratings = ratings;
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

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
