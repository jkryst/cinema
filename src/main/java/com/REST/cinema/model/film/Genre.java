package com.REST.cinema.model.film;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Genre {

    @Id @GeneratedValue
    long id;

    String genreName;

    @ManyToMany(mappedBy = "film_genres")
    Set<Film> films;

    public Genre() {
    }

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String categoryName) {
        this.genreName = genreName;
    }
}
