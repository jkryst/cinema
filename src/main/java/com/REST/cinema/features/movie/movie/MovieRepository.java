package com.REST.cinema.features.movie.movie;

import org.springframework.cglib.core.Local;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, JpaSpecificationExecutor<Movie> {
    Page<Movie> findAll(Specification<Movie> movieSpecification, Pageable pageable);

    List<Movie> findAll(Specification<Movie> movieSpecification);

    List<Movie> findAllByShows_date(LocalDate date);
}
