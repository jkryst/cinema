package com.REST.cinema.model.film;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String genreName;

    @ManyToMany(mappedBy = "genres")
    Set<Film> films;

       public Genre(String genreName) {
       this.genreName = genreName;
   }

}
