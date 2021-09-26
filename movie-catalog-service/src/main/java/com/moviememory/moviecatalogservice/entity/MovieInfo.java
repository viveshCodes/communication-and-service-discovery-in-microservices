package com.moviememory.moviecatalogservice.entity;

public class MovieInfo {
    private String movieId;
    private String movieName;
    private String movieDescription;

    //Constructors
    public MovieInfo() {
    }

    public MovieInfo(String movieId, String movieName, String movieDescription) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDescription=movieDescription;
    }

    // Getters
    public String getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    // Setters
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }
}
