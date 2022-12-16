package com.REST.cinema.repository;

import com.REST.cinema.model.film.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
