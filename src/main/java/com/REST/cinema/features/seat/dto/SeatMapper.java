package com.REST.cinema.features.seat.dto;

import com.REST.cinema.features.seat.Seat;

public class SeatMapper {
    public static SeatListDto mapToSeatListDto(Seat seat) {
        return SeatListDto.builder()
                .id(seat.getId())
                .type(seat.getSeatType().getType())
                .build();
    }

    public static SeatWithPricesDto mapToSeatWithPricesDto(Seat seat) {
        return SeatWithPricesDto.builder()
                .id(seat.getId())
                .rowNum(seat.getRowNum())
                .numInRow(seat.getNumInRow())
                .build();

    }
}
