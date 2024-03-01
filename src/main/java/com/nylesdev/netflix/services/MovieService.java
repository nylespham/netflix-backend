package com.nylesdev.netflix.services;

import com.nylesdev.netflix.entity.Movie;
import com.nylesdev.netflix.dao.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public Optional<Movie> getMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
