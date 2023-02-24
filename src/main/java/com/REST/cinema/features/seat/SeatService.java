package com.REST.cinema.features.seat;

public class SeatService {

    SeatRepository seatRepository;

    public Seat findSeatBySeatId(Long seatId) {
        return seatRepository.findById(seatId).get();
    }
}
