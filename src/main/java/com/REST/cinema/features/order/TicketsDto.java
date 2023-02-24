package com.REST.cinema.features.order;

import com.REST.cinema.features.seat.dto.SeatWithPriceDto;
import com.REST.cinema.features.show.Show;

import java.util.List;

public class TicketsDto {
    Show show;
    List<SeatWithPriceDto> seatsWithPricesDto;
    Double totalPrice;
}
