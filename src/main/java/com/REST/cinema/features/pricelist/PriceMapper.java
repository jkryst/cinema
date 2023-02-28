package com.REST.cinema.features.pricelist;

public class PriceMapper {
    public static PriceDto mapPriceToPriceDto(Price price) {
        return PriceDto.builder()
                .id(price.getId())
                .pricelistItem(price.getItem().getPriceItemName())
                .price(price.getPrice())
                .build();
    }
}
