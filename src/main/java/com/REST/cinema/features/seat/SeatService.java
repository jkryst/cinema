package com.REST.cinema.features.seat;

import org.springframework.stereotype.Service;

@Service
public class SeatService {

    SeatRepository seatRepository;

    public Seat getSeatBySeatId(Long seatId) {
        return seatRepository.findById(seatId).get();
    }
}
