package com.REST.cinema.features.pricelist;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PriceDto {
    Long id;
    String pricelistItem;
    double price;
}
