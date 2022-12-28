package com.REST.cinema.model.cinemaStructure;

import com.REST.cinema.model.priceList.PricelistItemsPrices;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SeatType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String type;

    @OneToMany
    @JoinColumn(name="seat_id", nullable = false)
    List<Seat> seats;

    @OneToMany(mappedBy = "seatType")
    List<PricelistItemsPrices> itemsPrices;

    public SeatType(String type, List<Seat> seats, List<PricelistItemsPrices> itemsPrices) {
        this.type = type;
        this.seats = seats;
        this.itemsPrices = itemsPrices;
    }
}
