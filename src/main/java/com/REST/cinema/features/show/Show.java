package com.REST.cinema.features.show;

import com.REST.cinema.features.screen.Screen;
import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.movie.movie.Movie;
import com.REST.cinema.features.pricelist.Pricelist;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JoinColumn(name="movie_id", nullable = false)
    Movie movie;


    @ManyToOne
    @JoinColumn(name="screen_id", nullable = false)
    Screen screen;

    @ManyToOne
    @JoinColumn(name="pricelist_id", nullable = false)
    Pricelist pricelist;

    LocalDateTime time;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name="show_id"),
    inverseJoinColumns = @JoinColumn(name="seat_id"))
    List<Seat> occupiedSeats;

    public Show(Movie movie, Screen screen, Pricelist pricelist, LocalDateTime time) {
        this.movie = movie;
        this.screen = screen;
        this.pricelist = pricelist;
        this.time = time;
    }
}
