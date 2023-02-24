package com.REST.cinema.features.seat.dto;

import com.REST.cinema.features.pricelist.PricelistItem;
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

    Map<PricelistItem, Double> prices;

}
