package com.moviememory.moviecatalogservice.entity;

import java.util.List;

public class UserRating {
    private List<RatingData> userRatings;

    // Constructors
    public UserRating() {
    }

    public UserRating(List<RatingData> userRatings) {
        this.userRatings = userRatings;
    }
    
    // Getters and Setters
    public List<RatingData> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<RatingData> userRatings) {
        this.userRatings = userRatings;
    }
}
