package com.REST.cinema.features.movie.movie.dto;

import com.REST.cinema.features.movie.genre.dto.GenreMapper;
import com.REST.cinema.features.movie.movie.Movie;

import java.util.stream.Collectors;

public class MovieMapper {
    public static MovieDto map(Movie movie) {
        return MovieDto.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .shortDescription(movie.getShortDescription())
                .durationInMinutes(movie.getDurationInMinutes())
                .rating(movie.getRating())
                .restriction(movie.getRestriction().getType())
                .genres(movie
                        .getGenres()
                        .stream()
                        .map(GenreMapper::map).collect(Collectors.toSet()))
                .build();
    }
}
