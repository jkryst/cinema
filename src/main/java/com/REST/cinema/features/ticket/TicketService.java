package com.REST.cinema.features.ticket;

import com.REST.cinema.features.pricelist.PriceService;
import com.REST.cinema.features.seat.SeatService;
import com.REST.cinema.features.seat.dto.SeatWithPriceDto;
import com.REST.cinema.features.show.Show;
import com.REST.cinema.features.show.ShowService;
import com.REST.cinema.features.show.dto.ShowMapper;
import com.REST.cinema.features.ticket.dto.TicketsDto;
import com.REST.cinema.features.ticket.dto.TicketsRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TicketService {

    @Autowired
    public ShowService showService;
    @Autowired
    public SeatService seatService;
    @Autowired
    public PriceService priceService;

    @Autowired
    public TicketRepository ticketRepository;

    public TicketsDto createTickets(TicketsRequestDto ticketsRequestDto) {

        Show show = showService.getShowById(ticketsRequestDto.getShowId());

        List<Ticket> tickets = new ArrayList<>();

        for (Map.Entry<Long, Long> entry : ticketsRequestDto.getChosenSeatIdWithPriceId().entrySet()
             ) {
            Ticket ticket = new Ticket();
            ticket.setShow(show);
            ticket.setSeat(seatService.getSeatBySeatId(entry.getKey()));
            ticket.setPrice(priceService.getPriceById(entry.getValue()));
            tickets.add(ticket);
            ticketRepository.save(ticket);
        }

        TicketsDto ticketsDto = TicketsDto.builder()
                .showDto(ShowMapper.mapToShowDto(show))
                .seatsWithPricesDto(tickets.stream()
                        .map(ticket -> {
                            return SeatWithPriceDto.builder()
                                    .rowNum(ticket.getSeat().getRowNum())
                                    .numInRow(ticket.getSeat().getNumInRow())
                                    .ticketName(ticket.getPrice().getItem().getPriceItemName())
                                    .price(ticket.getPrice().getPrice())
                                    .build();
                        }).collect(Collectors.toList()))
                .totalPrice(tickets.stream().mapToDouble(ticket -> ticket.getPrice().getPrice()).sum())
                .build();
        return ticketsDto;
    }
}
