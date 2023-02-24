package com.REST.cinema.features.order;

import com.REST.cinema.features.pricelist.PriceService;
import com.REST.cinema.features.seat.SeatService;
import com.REST.cinema.features.show.Show;
import com.REST.cinema.features.show.ShowService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TicketService {

    @Autowired
    public ShowService showService;
    @Autowired
    public SeatService seatService;
    @Autowired
    public PriceService priceService;

    public TicketRepository ticketRepository;

    public void createTickets(TicketsRequestDto ticketsRequestDto) {

        Show show = showService.getShowById(ticketsRequestDto.showID);

        List<Ticket> tickets = new ArrayList<>();


        for (Map.Entry<Long, Long> entry : ticketsRequestDto.chosenSeatIdWithPricelistItemId.entrySet()
             ) {
            Ticket ticket = new Ticket();
            ticket.setShow(show);
            ticket.setSeat(seatService.findSeatBySeatId(entry.getKey()));
            //ticket.setPrice(priceService.getPrice(show, seatService.findSeatBySeatId(entry.getKey()), entry.getValue()));

            tickets.add(ticket);

            ticketRepository.save(ticket);


        }


    }
}
