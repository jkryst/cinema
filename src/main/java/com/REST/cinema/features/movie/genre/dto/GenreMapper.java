package com.REST.cinema.features.movie.genre.dto;

import com.REST.cinema.features.movie.genre.Genre;

public class GenreMapper {
    public static GenreDto map(Genre genre) {
        return GenreDto.builder()
                .name(genre.getGenreName())
                .build();
    }
}
