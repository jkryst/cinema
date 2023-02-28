package com.REST.cinema.features.ticket;

import com.REST.cinema.features.ticket.dto.TicketsDto;
import com.REST.cinema.features.ticket.dto.TicketsRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/tickets")
    public TicketsDto createTickets(@RequestBody TicketsRequestDto ticketsRequestDto) {
        return ticketService.createTickets(ticketsRequestDto);
    }
}
