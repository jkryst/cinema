package com.REST.cinema.repository;

import com.REST.cinema.model.film.Restriction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestrictionRespository extends JpaRepository<Restriction, Long> {
}
