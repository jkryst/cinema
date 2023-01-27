package com.REST.cinema.features.seat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    int rowNum;
    int numInRow;

    @ManyToOne
    @JoinColumn(name="seat_type_id", nullable = false)
    SeatType seatType;

    public Seat(char rowNum, int numInRow, SeatType seatType) {
        this.rowNum = rowNum;
        this.numInRow = numInRow;
        this.seatType = seatType;
    }
}
