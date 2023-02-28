package com.REST.cinema.features.ticket;

import com.REST.cinema.features.pricelist.Price;
import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.show.Show;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    Show show;

    @ManyToOne
    Price price;

    @ManyToOne
    Seat seat;
}
