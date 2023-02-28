package com.REST.cinema.features.ticket;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TicketController {

    TicketService ticketService;

//    @PostMapping("/tickets")
//    public TicketsDto createTickets(TicketsRequestDto ticketsRequestDto) {
//        return ticketService.createTickets(ticketsRequestDto);
//    }
}
