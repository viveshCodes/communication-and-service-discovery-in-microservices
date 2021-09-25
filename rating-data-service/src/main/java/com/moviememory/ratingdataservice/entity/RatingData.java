package com.moviememory.ratingdataservice.entity;

public class RatingData {

    private String movieId;
    private double rating;

    // Constructors
    public RatingData() {
    }

    public RatingData(String movieId, double rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    // Getters
    public String getMovieId() {
        return movieId;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
