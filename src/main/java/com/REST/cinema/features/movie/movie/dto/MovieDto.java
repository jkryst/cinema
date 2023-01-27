package com.REST.cinema.features.movie.movie.dto;

import com.REST.cinema.features.movie.genre.dto.GenreDto;
import com.REST.cinema.features.show.Show;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class MovieDto {

    long id;
    public String title;
    String shortDescription;
    int durationInMinutes;
    double rating;
    String restriction;
    Set<GenreDto> genres;

    //Set<ShowDto> shows;
}
