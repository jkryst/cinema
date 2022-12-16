package com.REST.cinema;

import com.REST.cinema.model.film.Film;
import com.REST.cinema.model.film.Genre;
import com.REST.cinema.model.film.Restriction;
import com.REST.cinema.repository.FilmRepository;
import com.REST.cinema.repository.GenreRepository;
import com.REST.cinema.repository.RestrictionRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(FilmRepository filmRep, RestrictionRespository restrictionRep, GenreRepository genreRep) {

        restrictionRep.save(new Restriction("G – General Audiences",
                "All ages admitted. Nothing that would offend parents for viewing by children."));
        restrictionRep.save(new Restriction("NC-17 – Adults Only",
                "No One 17 and Under Admitted. Clearly adult. Children are not admitted."));

        genreRep.save(new Genre("Horror"));
        genreRep.save(new Genre("Comedy"));
        genreRep.save(new Genre("Drama"));
        genreRep.save(new Genre("Fantasy"));


        filmRep.save(new Film("Apokawixa", "Lorem ipsum", "" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit", restrictionRep.findById(1L), 10.00));

        filmRep.save(new Film("Hello", "Lorem ipsum", "" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit", 130, 9.50));




        return args -> {
            log.info("Preloading database");

        };
    }


}
