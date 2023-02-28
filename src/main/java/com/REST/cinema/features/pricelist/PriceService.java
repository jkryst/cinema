package com.REST.cinema.features.pricelist;

import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.show.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    @Autowired
    PriceRepository priceRepository;

    public List<Price> getPrices(Show show, Seat seat) {
        return priceRepository.findAllByPricelistIdAndSeatTypeId(show.getPricelist().getId(), seat.getSeatType().getId());
    }

    public Price getPriceById(Long priceId) {
        return priceRepository.findById(priceId).get();
    }

}
