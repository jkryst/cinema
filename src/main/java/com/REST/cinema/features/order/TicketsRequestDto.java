package com.REST.cinema.features.order;

import java.util.Map;

public class TicketsRequestDto {
    Long showID;
    Map<Long, Long> chosenSeatIdWithPricelistItemId;
}
