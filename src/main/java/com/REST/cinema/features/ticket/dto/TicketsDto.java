package com.REST.cinema.features.ticket.dto;

import com.REST.cinema.features.seat.dto.SeatWithPriceDto;
import com.REST.cinema.features.show.Show;
import lombok.Getter;

import java.util.List;

@Getter
public class TicketsDto {
    private Show show;
    private List<SeatWithPriceDto> seatsWithPricesDto;
    private Double totalPrice;
}
