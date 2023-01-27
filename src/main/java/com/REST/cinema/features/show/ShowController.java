package com.REST.cinema.features.show;

import com.REST.cinema.features.show.dto.ShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping("/shows/{showId}")
    ShowDto getShow(@PathVariable Long showId){
    return showService.getShowById(showId);
    }
}
