package com.moviememory.moviecatalogservice.controller;

import com.moviememory.moviecatalogservice.entity.MovieCatalog;
import com.moviememory.moviecatalogservice.entity.MovieInfo;
import com.moviememory.moviecatalogservice.entity.RatingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

     /**
      * DES: Get Details and ratings of movies rated by user
      * Scope: Public
      */
    @GetMapping("/catalog/{userId}")
    public List<MovieCatalog> getMovieCatalog(@PathVariable("userId") String userId){

        // Step 1:Get all rated movies Ids
        List<RatingData> ratings = Arrays.asList(
                new RatingData("MI02",8.1),
                new RatingData("JR03",7.8)

        );
        String sourceUrl = "http://localhost:8082/movies/";

        return ratings.stream().map(rating->{
            MovieInfo movie = restTemplate.getForObject(sourceUrl+ rating.getMovieId(),MovieInfo.class);
         /* MovieInfo movie = webClientBuilder.build()
                   .get()
                   .uri(sourceUrl+rating.getMovieId())
                   .retrieve()
                   .bodyToMono(MovieInfo.class)
                   .block();
         */
            return new MovieCatalog(movie.getMovieName(),movie.getMovieDescription(), rating.getRating());
        }).collect(Collectors.toList());
    }
}
