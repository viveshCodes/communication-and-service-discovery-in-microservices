package com.moviememory.ratingdataservice.controller;

import com.moviememory.ratingdataservice.entity.RatingData;
import com.moviememory.ratingdataservice.entity.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RatingDataResource {

    @GetMapping("/ratingdata/{movieId}")
    public RatingData getRatigData(@PathVariable String movieId){
        return new RatingData(movieId,7.3);
    }

    @GetMapping("/users/{userId}")
    public UserRating getRatings(@PathVariable String userId){
        List<RatingData> ratings = Arrays.asList(
                new RatingData("MI02",8.1),
                new RatingData("JR03",7.8)

        );
        UserRating userRating  = new UserRating();
        userRating.setUserRatings(ratings);
        return userRating;
    }
}
