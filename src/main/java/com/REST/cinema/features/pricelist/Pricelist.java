package com.REST.cinema.features.pricelist;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pricelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String pricelistName;

//    @OneToMany(mappedBy = "pricelist")
//    List<PricelistItemsPrices> itemsPrices;


    public Pricelist(String pricelistName) {
        this.pricelistName = pricelistName;
    }
}
