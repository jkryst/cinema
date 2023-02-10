package com.REST.cinema.features.screen;

import com.REST.cinema.features.seat.Seat;
import org.springframework.stereotype.Service;

@Service
public class ScreenService {

    public Seat[][] screenToArray(Screen screen){

        Seat[][] seats = new Seat[screen.getRows()][screen.getSeatsInRow()];
        for(Seat s: screen.getSeats()) {
            seats[s.getRowNum()-1][s.getNumInRow()-1] = s;
        }

        return seats;
    }


}
