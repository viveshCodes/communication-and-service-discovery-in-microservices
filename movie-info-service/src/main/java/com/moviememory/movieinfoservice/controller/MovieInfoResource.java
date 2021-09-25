package com.moviememory.movieinfoservice.controller;

import com.moviememory.movieinfoservice.entity.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class MovieInfoResource {

    @GetMapping("/movies/{movieId}")
    public List<MovieInfo> getMovieInfo(@PathVariable String movieId){
        return Collections.singletonList(
                new MovieInfo("JM01","Jerry Maguire")
        );
    }
}
