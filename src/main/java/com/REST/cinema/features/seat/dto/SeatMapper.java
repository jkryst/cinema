package com.REST.cinema.features.seat.dto;

import com.REST.cinema.features.seat.Seat;

public class SeatMapper {
    public static SeatListDto map(Seat seat) {
        return SeatListDto.builder()
                .id(seat.getId())
                .type(seat.getSeatType().getType())
                .build();
    }
}
