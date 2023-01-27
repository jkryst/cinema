package com.REST.cinema.features.movie.movie;

import com.REST.cinema.features.movie.genre.Genre;
import com.REST.cinema.features.movie.restriction.Restriction;
import com.REST.cinema.features.show.Show;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Movie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    public String title;
    String shortDescription;
    String longDescription;
    int durationInMinutes;
    double rating;
    @Enumerated(EnumType.STRING)
    Restriction restriction;

    @ManyToMany
    @JoinTable(name="movie_genres",
    joinColumns =@JoinColumn(name = "movie_id"),
    inverseJoinColumns =@JoinColumn(name = "genre_id"))
    List<Genre> genres;

    @OneToMany(mappedBy = "movie")
    List<Show> shows;

    public Movie(String title, String shortDescription, String longDescription, int duration, double rating, Restriction restriction, List<Genre> genres) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.durationInMinutes = duration;
        this.rating = rating;
        this.restriction = restriction;
        this.genres = genres;
    }

    public Movie(String title, String shortDescription, String longDescription, int duration, double rating, Restriction restriction) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.durationInMinutes = duration;
        this.rating = rating;
        this.restriction = restriction;
    }

}
