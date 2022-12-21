package com.REST.cinema.model.film;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Film {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    public String title;
    String shortDescription;
    String longDescription;
    int duration;
    double rating;

    @ManyToOne
    @JoinColumn(name="restriction_id", nullable = false)
    Restriction restriction;


    @ManyToMany
    @JoinTable(name = "film_genres",
    joinColumns = @JoinColumn(name ="film_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id") )
    Set<Genre> genres;

    public Film(String title, String shortDescription, String longDescription, int duration, double rating, Restriction restriction, Set<Genre> genres) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.duration = duration;
        this.rating = rating;
        this.restriction = restriction;
        this.genres = genres;
    }

}
