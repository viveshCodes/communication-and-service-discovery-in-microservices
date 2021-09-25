package com.moviememory.ratingdataservice.controller;

import com.moviememory.ratingdataservice.entity.RatingData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingDataResource {

    @GetMapping("/ratingdata/{movieId}")
    public RatingData getRatigData(@PathVariable String movieId){
        return new RatingData(movieId,7.3);
    }
}
