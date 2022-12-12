package com.REST.cinema.controller;
import com.REST.cinema.model.Film;
import com.REST.cinema.repository.FilmRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    private final FilmRepository repository;

    public FilmController(FilmRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/movies")
    List<Film> all() {
        return repository.findAll();



    }

}
