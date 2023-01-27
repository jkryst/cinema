package com.REST.cinema.features.movie.movie;

import com.REST.cinema.features.movie.movie.dto.MovieDto;
import com.REST.cinema.features.movie.movie.dto.MovieMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<MovieDto> getAllMovies(){

        return movieRepository.findAll().stream().map(MovieMapper::map).collect(Collectors.toList());
    }
}
