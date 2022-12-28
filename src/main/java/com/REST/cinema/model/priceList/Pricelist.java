package com.REST.cinema.model.priceList;

import com.REST.cinema.model.show.Show;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pricelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String priceListName;

    @OneToMany(mappedBy = "pricelist")
    List<PricelistItemsPrices> itemsPrices;

    @OneToMany(mappedBy = "pricelist")
    Set<Show> shows;

    public Pricelist(String priceListName) {
        this.priceListName = priceListName;
    }
}
