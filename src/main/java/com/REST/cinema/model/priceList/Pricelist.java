package com.REST.cinema.model.priceList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pricelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String priceListName;

    public Pricelist(String priceListName) {
        this.priceListName = priceListName;
    }
}
