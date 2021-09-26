package com.moviememory.moviecatalogservice.controller;

import com.moviememory.moviecatalogservice.entity.MovieCatalog;
import com.moviememory.moviecatalogservice.entity.MovieInfo;
import com.moviememory.moviecatalogservice.entity.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

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

        String movieInfoSourceUrl = "http://localhost:8082/movies/";
        String ratingSourceUrl = "http://localhost:8083/users/";

        //Get all rated movies Ids
        UserRating ratings = restTemplate.getForObject(ratingSourceUrl + userId,UserRating.class);

        return ratings.getUserRatings().stream().map(rating->{
            MovieInfo movie = restTemplate.getForObject(movieInfoSourceUrl+ rating.getMovieId(),MovieInfo.class);
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
