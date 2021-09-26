package com.moviememory.moviecatalogservice.entity;


public class MovieCatalog {

    private String movieName;
    private String movieDescription;
    private double movieRating;

    // Constructors


    public MovieCatalog() {
    }

    public MovieCatalog(String movieName, String movieDescription, double movieRating) {
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.movieRating = movieRating;
    }

    //  Getters

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public double getMovieRating() {
        return movieRating;
    }


    // Setters

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }
}
