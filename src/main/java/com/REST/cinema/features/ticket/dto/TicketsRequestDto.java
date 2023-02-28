package com.REST.cinema.features.ticket.dto;

import lombok.Getter;

import java.util.Map;

@Getter
public class TicketsRequestDto {
    private Long showID;
    private Map<Long, Long> chosenSeatIdWithPricelistItemId;
}
