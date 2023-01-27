package com.REST.cinema.features.seat.dto;

import com.REST.cinema.features.seat.Seat;

public class SeatMapper {
    public static SeatDto map(Seat seat) {
        return SeatDto.builder()
                .id(seat.getId())
                .type(seat.getSeatType().getType())
                .build();
    }
}
