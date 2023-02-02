package com.REST.cinema.features.movie.movie;

import com.REST.cinema.features.movie.movie.dto.MovieDto;
import com.REST.cinema.features.movie.movie.dto.MovieMapper;
import com.REST.cinema.features.movie.movie.dto.MovieWithShowsDto;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<MovieWithShowsDto> getAllMoviesWithShows(){

        return movieRepository.findAll().stream().map(MovieMapper::mapWithShows).collect(Collectors.toList());
    }

    public Page<MovieDto> getAllMovies(String title, String genre, Pageable pageable){

        Page<Movie> movies = movieRepository.findAll(MovieSpecification.getMoviesSpecification(title, genre), pageable);

        return movies.map(MovieMapper::map);
    }


}
