package com.REST.cinema.features.movie.movie.dto;

import com.REST.cinema.features.movie.genre.dto.GenreMapper;
import com.REST.cinema.features.movie.movie.Movie;
import com.REST.cinema.features.show.dto.ShowMapper;

import java.time.LocalDate;
import java.time.LocalTime;
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
                        .map(GenreMapper::map).collect(Collectors.toList()))
                .build();
    }

    public static MovieWithShowsDto mapWithShowsbyDate(Movie movie, LocalDate date) {
        return MovieWithShowsDto.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .shortDescription(movie.getShortDescription())
                .durationInMinutes(movie.getDurationInMinutes())
                .rating(movie.getRating())
                .restriction(movie.getRestriction().getType())
                .genres(movie
                        .getGenres()
                        .stream()
                        .map(GenreMapper::map).collect(Collectors.toList()))
                .shows(movie
                        .getShows()
                        .stream()
                        .filter(show -> show.getDate().equals(date))
                        .filter(show -> {
                            if(date.equals(LocalDate.now())) {
                             return show.getTime().isAfter(LocalTime.now());
                            } else {
                             return true;
                            }
                        })
                        .map(ShowMapper::mapToList)
                        .collect(Collectors.toList()))
                .build();
    }


}
