package com.REST.cinema.model.film;

import com.REST.cinema.model.film.Film;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Restriction {

    @Id
    @GeneratedValue
    long id;
    String type;

    String description;

    @OneToMany(mappedBy = "restriction")
    Set<Film> films;

    public Restriction() {
    }

    public Restriction(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
