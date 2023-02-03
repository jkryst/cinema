package com.REST.cinema.features.movie.movie;

import com.REST.cinema.features.movie.movie.dto.MovieDto;
import com.REST.cinema.features.movie.movie.dto.MovieMapper;
import com.REST.cinema.features.movie.movie.dto.MovieWithShowsDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    MovieSearchSpecification movieSearchSpecification;

    public List<MovieWithShowsDto> getMovies(String date){

        LocalDate localDate;
        LocalDate dateNow = LocalDate.now();

        try {
            localDate = LocalDate.parse(date);
        } catch (DateTimeParseException | NullPointerException ex) {
            localDate = dateNow;
        }

        if(localDate.isBefore(dateNow)) localDate = dateNow;
        if(localDate.isAfter(dateNow.plusDays(7))) localDate = dateNow.plusDays(7);

        List<Movie> movies = movieRepository.findAllByShows_date(localDate);

        LocalDate finalLocalDate = localDate;
        return movies.stream().map(movie -> MovieMapper.mapWithShowsbyDate(movie, finalLocalDate)).collect(Collectors.toList());
    }

    public Page<MovieDto> getAllMovies(String title, String genre, Double rating, int page, String sortBy, String sortOrder){

        int size = 10;

        Pageable pageable = PageRequest.of(page, size, Sort.by(movieSearchSpecification.createSortOrder(sortBy,sortOrder.toUpperCase())));

        Page<Movie> movies = movieRepository.findAll(movieSearchSpecification.getMoviesSpecification(title, genre, rating), pageable);

        return movies.map(MovieMapper::map);
    }


}
