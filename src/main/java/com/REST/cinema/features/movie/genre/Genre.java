package com.REST.cinema.features.movie.genre;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String genreName;


    public Genre(String genreName) {
        this.genreName = genreName;
   }

}
