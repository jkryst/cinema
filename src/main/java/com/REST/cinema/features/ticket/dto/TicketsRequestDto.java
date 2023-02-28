package com.REST.cinema.features.ticket.dto;

import lombok.Getter;

import java.util.Map;

@Getter
public class TicketsRequestDto {
    private Long showId;
    private Map<Long, Long> chosenSeatIdWithPriceId;
}
