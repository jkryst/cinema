package com.REST.cinema.features.seat.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SeatDto {
    Long id;
    String type;
    boolean isOccupied;
}
