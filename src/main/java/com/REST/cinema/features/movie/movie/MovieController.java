package com.REST.cinema.features.movie.movie;
import com.REST.cinema.features.movie.movie.dto.MovieDto;
import com.REST.cinema.features.movie.movie.dto.MovieWithShowsDto;
import com.REST.cinema.features.show.ShowService;
import com.REST.cinema.features.show.dto.ShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    List<MovieWithShowsDto> getAll() {
        return movieService.getAllMoviesWithShows();
    }

    @GetMapping("/movies/all")
    Page<MovieDto> getAll(String title,
                          String genre,
                          @PageableDefault Pageable pageable

//                        @RequestParam(required = false) Double rating
    ) {

        return movieService.getAllMovies(title, genre, pageable);
    }

}
