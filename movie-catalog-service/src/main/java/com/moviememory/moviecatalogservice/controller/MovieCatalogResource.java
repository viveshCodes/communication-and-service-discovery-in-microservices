package com.moviememory.moviecatalogservice.controller;

import com.moviememory.moviecatalogservice.entity.MovieCatalog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collections;
import java.util.List;


@RestController
public class MovieCatalogResource {

     /**
      * DES: Get Details and ratings of movies rated by user
      * Scope: Public
      */
    @GetMapping("/catalog/{userId}")
    public List<MovieCatalog> getMovieCatalog(@PathVariable("userId") String userId){
        System.out.println(userId);
        return Collections.singletonList(
                new MovieCatalog("Jerry Maguire", "Jerry Maguire is a 1996 American romantic comedy-drama sports film written, produced, and directed by Cameron Crowe, and stars Tom Cruise", 7)
        );
    }
}
