package com.REST.cinema.features.seat.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.util.Map;

@Builder
@Data
public class SeatWithPricesDto {
    long id;

    int rowNum;

    int numInRow;
    Map<String, Double> prices;

}
