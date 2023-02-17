package com.REST.cinema.features.pricelist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceListItemsPricesRepository extends JpaRepository<PricelistItemsPrices, Long> {
    List<PricelistItemsPrices> findAllByPricelistIdAndSeatTypeId(Long pricelistId, Long seatTypeId);
}
