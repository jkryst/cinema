package com.REST.cinema.features.seat.dto;

import com.REST.cinema.features.seat.Seat;

public class SeatMapper {
    public static SeatDto map(Seat seat) {
        return SeatDto.builder()
                .row(seat.getRowNum())
                .numInRow(seat.getNumInRow())
                .type(seat.getSeatType().toString())
                .build();
    }
}
