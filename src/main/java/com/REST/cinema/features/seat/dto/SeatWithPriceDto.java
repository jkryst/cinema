package com.REST.cinema.features.seat.dto;

import com.REST.cinema.features.pricelist.PricelistItem;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Builder
@Data
public class SeatWithPriceDto {

    int rowNum;

    int numInRow;

    String ticketName;

    double price;

}

