package com.REST.cinema.features.movie.movie;

import com.REST.cinema.features.movie.genre.Genre;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MovieSpecification {

    public static Specification<Movie> getMoviesSpecification(String title, String genre) {

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





            //Predicate p3 = criteriaBuilder.greaterThan(Double.valueOf(String.valueOf(root.get("rating"))), rating);

            return criteriaBuilder.and(predicates.toArray(predicates.toArray(new Predicate[0])));
        };
    }
}
