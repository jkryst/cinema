package com.REST.cinema.config;

import com.REST.cinema.features.movie.movie.Movie;
import com.REST.cinema.features.movie.movie.MovieRepository;
import com.REST.cinema.features.pricelist.Pricelist;
import com.REST.cinema.features.pricelist.PricelistRepository;
import com.REST.cinema.features.screen.Screen;
import com.REST.cinema.features.screen.ScreenRepository;
import com.REST.cinema.features.show.Show;
import com.REST.cinema.features.show.ShowRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Autowired
    MovieRepository movies;
    @Autowired
    ShowRepository shows;
    @Autowired
    ScreenRepository screens;
    @Autowired
    PricelistRepository pricelists;

    @Bean
    CommandLineRunner initDatabase() {

        return args -> {
            log.info("Preloading database from data.sql");

        };
    }


}
