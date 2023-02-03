package com.REST.cinema.features.movie.movie;

import com.REST.cinema.features.movie.genre.Genre;
import com.REST.cinema.features.show.Show;
import jakarta.persistence.criteria.*;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class MovieSearchSpecification {

    public Specification<Movie> getMoviesSpecification(String title, String genre, Double rating) {

        return (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            if(Objects.nonNull(title)) {
                predicates.add(
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("title")),
                        ("%" + title + "%").toLowerCase()));
            }

            if(Objects.nonNull(genre)) {

                ListJoin<Movie, Genre> genres = root.joinList("genres", JoinType.INNER);
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(genres.get("genreName")),
                        ("%" + genre + "%").toLowerCase()));
            }

            if(Objects.nonNull(rating)) {

                predicates.add(criteriaBuilder.greaterThan(root.get("rating"), rating));
            }

            return criteriaBuilder.and(predicates.toArray(predicates.toArray(new Predicate[0])));
        };
    }



    public Sort.Order createSortOrder(String sortBy, String sortOrder){

        List<String> sortingParametres = List.of("title", "durationInMinutes", "rating", "restriction");
        if(!sortingParametres.contains(sortBy)) sortBy = "title";

        if(!sortOrder.equals("DESC")) sortOrder = "ASC";

        return new Sort.Order(Sort.Direction.valueOf(sortOrder), sortBy);
    }
}
