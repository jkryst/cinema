package com.REST.cinema.model.show;

import com.REST.cinema.model.cinemaStructure.Screen;
import com.REST.cinema.model.cinemaStructure.Seat;
import com.REST.cinema.model.film.Film;
import com.REST.cinema.model.priceList.Pricelist;
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
    @JoinColumn(name="film_id", nullable = false)
    Film film;


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






}
