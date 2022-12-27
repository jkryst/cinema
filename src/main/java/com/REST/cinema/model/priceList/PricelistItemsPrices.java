package com.REST.cinema.model.priceList;

import com.REST.cinema.model.cinemaStructure.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PricelistItemsPrices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JoinColumn(name="pricelist_id", nullable = false)
    Pricelist pricelist;

    @ManyToOne
    @JoinColumn(name="pricelist_item_id", nullable = false)
    PricelistItem item;

    @ManyToOne
    @JoinColumn(name="seat_type_id", nullable = false)
    SeatType seatType;

    double price;

    public PricelistItemsPrices(Pricelist pricelist, PricelistItem item, SeatType seatType, double price) {
        this.pricelist = pricelist;
        this.item = item;
        this.seatType = seatType;
        this.price = price;
    }
}
