package com.REST.cinema.model.cinemaStructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JoinColumn(name="screen_id", nullable = false)
    Screen screen;

    @ManyToOne
    @JoinColumn(name="seat_type_id", nullable = false)
    SeatType seatType;

    public Seat(Screen screen, SeatType seatType) {
        this.screen = screen;
        this.seatType = seatType;
    }
}
