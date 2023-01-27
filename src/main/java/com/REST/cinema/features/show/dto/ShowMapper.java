package com.REST.cinema.features.show.dto;

import com.REST.cinema.features.seat.SeatType;
import com.REST.cinema.features.seat.dto.SeatDto;
import com.REST.cinema.features.seat.dto.SeatMapper;
import com.REST.cinema.features.show.Show;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowMapper {


    public static ShowDto map(Show show) {

        //SeatDto[][] screen = new SeatDto[][][show.getScreen().getRows()][show.getScreen().getSeatsInRow()];
        //Map<String, SeatDto> specialSeats = new HashMap<>();

        return ShowDto.builder()
                .movieTitle(show.getMovie().getTitle())
                .time(show.getTime())
                .seats(show.getScreen().getSeats().stream().map(SeatMapper::map).collect(Collectors.toList()))
                .occupiedSeats(show.getOccupiedSeats().stream().map(SeatMapper::map).collect(Collectors.toList()))
                .build();

    }
}
