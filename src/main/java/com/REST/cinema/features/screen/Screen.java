package com.REST.cinema.features.screen;
import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.show.Show;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    int seatsInRow;
    int rows;

    //Seat[][] seats;
    @OneToMany
    @JoinColumn(name = "screen_id")
    Set<Seat> seats;

    @OneToMany(mappedBy = "screen")
    Set<Show> shows;

    public Screen(int rows, int columns) {
        this.seatsInRow = rows;
        this.rows = columns;
    }
}
