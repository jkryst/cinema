package com.REST.cinema.repository;

import com.REST.cinema.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FilmRepository extends JpaRepository<Film, Long> {
}
