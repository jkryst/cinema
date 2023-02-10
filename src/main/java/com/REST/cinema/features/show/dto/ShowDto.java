package com.REST.cinema.features.show.dto;

import com.REST.cinema.features.seat.dto.SeatListDto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowDto {

    String movieTitle;

    LocalDate date;

    LocalTime time;

    int screenNum;

    SeatListDto[][] screen;

}
