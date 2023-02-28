package com.REST.cinema.features.pricelist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findAllByPricelistIdAndSeatTypeId(Long pricelistId, Long seatTypeId);
}
