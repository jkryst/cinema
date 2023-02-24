package com.REST.cinema.features.seat.dto;

import com.REST.cinema.features.seat.Seat;

public class SeatMapper {
    public static SeatOnGridDto mapToSeatListDto(Seat seat) {
        return SeatOnGridDto.builder()
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
