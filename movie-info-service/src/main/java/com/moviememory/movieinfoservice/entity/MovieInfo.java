package com.moviememory.movieinfoservice.entity;

public class MovieInfo {

    private String movieId;
    private String movieName;

    //Constructors
    public MovieInfo() {
    }

    public MovieInfo(String movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    // Getters
    public String getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    // Setters
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
