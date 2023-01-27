package com.REST.cinema.features.movie.movie;
import com.REST.cinema.features.movie.movie.dto.MovieDto;
import com.REST.cinema.features.show.ShowService;
import com.REST.cinema.features.show.dto.ShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ShowService showService;

    @GetMapping("/movies")
    List<MovieDto> getAll() {
        return movieService.getAllMovies();
    }
}
