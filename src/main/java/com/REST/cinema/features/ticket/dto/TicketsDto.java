package com.REST.cinema.features.ticket.dto;

import com.REST.cinema.features.seat.dto.SeatWithPriceDto;
import com.REST.cinema.features.show.Show;
import com.REST.cinema.features.show.dto.ShowDto;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class TicketsDto {
    private ShowDto showDto;
    private List<SeatWithPriceDto> seatsWithPricesDto;
    private Double totalPrice;
}
