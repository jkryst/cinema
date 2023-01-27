package com.REST.cinema.features.seat.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SeatDto {
    int row;
    int numInRow;

    String type;
}
