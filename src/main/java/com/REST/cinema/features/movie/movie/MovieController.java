package com.REST.cinema.features.movie.movie;
import com.REST.cinema.features.movie.movie.dto.MovieDto;
import com.REST.cinema.features.movie.movie.dto.MovieWithShowsDto;
import com.REST.cinema.features.show.ShowService;
import com.REST.cinema.features.show.dto.ShowDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ShowService showService;

    @GetMapping("/movies")
    List<MovieWithShowsDto> getMovies(String date) {
        return movieService.getMovies(date);
    }

    @GetMapping("/movies/all")
    Page<MovieDto> getAll(String title,
                          String genre,
                          Double rating,
                          @RequestParam(defaultValue = "0") Integer page,
                          @RequestParam(defaultValue = "title") String sortBy,
                          @RequestParam(defaultValue = "ASC") String sortOrder) {

        return movieService.getAllMovies(title, genre, rating, page, sortBy, sortOrder);
    }

}
