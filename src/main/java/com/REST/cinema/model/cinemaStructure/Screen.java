package com.REST.cinema.model.cinemaStructure;

import com.REST.cinema.model.film.Genre;
import com.REST.cinema.model.film.Restriction;
import com.REST.cinema.model.show.Show;
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
    int rows;
    double columns;

    @OneToMany(mappedBy = "screen")
    List<Seat> seats;

    @OneToMany(mappedBy = "screen")
    Set<Show> shows;

    public Screen(int rows, double columns, List<Seat> seats) {
        this.rows = rows;
        this.columns = columns;
        this.seats = seats;
    }
}
