package com.moviememory.moviecatalogservice.controller.entity;


public class MovieCatalog {

    private String name;
    private String description;
     private int rating;

    // Constructors


    public MovieCatalog() {
    }

    public MovieCatalog(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    //  Getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }


    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
