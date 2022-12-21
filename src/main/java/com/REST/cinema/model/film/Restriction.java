package com.REST.cinema.model.film;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Restriction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String type;

    String description;

    @OneToMany(mappedBy = "restriction")
    Set<Film> films;


    public Restriction(String type, String description) {
        this.type = type;
        this.description = description;
    }

}
