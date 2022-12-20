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

        return args -> {
            log.info("Preloading database from data.sql");

        };
    }


}
