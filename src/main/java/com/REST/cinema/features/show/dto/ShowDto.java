package com.REST.cinema.features.show.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Builder
public class ShowDto {
    private String movieTitle;

    private LocalDate date;

    private LocalTime time;
}
