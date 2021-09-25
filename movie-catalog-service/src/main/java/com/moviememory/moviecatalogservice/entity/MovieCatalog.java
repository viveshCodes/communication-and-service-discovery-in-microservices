package com.moviememory.moviecatalogservice.entity;


public class MovieCatalog {

    private String movieName;
    private String movieDescription;
     private int movieRating;

    // Constructors


    public MovieCatalog() {
    }

    public MovieCatalog(String movieName, String movieDescription, int movieRating) {
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

    public int getMovieRating() {
        return movieRating;
    }


    // Setters

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }
}
