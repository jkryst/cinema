package com.REST.cinema.model.priceList;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PricelistItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToMany(mappedBy = "item")
    List<PricelistItemsPrices> itemsPrices;

    String priceItemName;

    public PricelistItem(String priceItemName) {
        this.priceItemName = priceItemName;
    }
}
