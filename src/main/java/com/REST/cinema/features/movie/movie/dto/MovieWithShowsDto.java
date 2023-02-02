package com.REST.cinema.features.movie.movie.dto;

import com.REST.cinema.features.movie.genre.dto.GenreDto;
import com.REST.cinema.features.show.dto.ShowDtoList;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MovieWithShowsDto {

    long id;
    public String title;
    String shortDescription;
    int durationInMinutes;
    double rating;
    String restriction;
    List<GenreDto> genres;
    List<ShowDtoList> shows;
}
