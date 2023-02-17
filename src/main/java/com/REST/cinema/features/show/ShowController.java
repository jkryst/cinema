package com.REST.cinema.features.show;

import com.REST.cinema.features.pricelist.PricelistItemsPrices;
import com.REST.cinema.features.seat.dto.SeatWithPricesDto;
import com.REST.cinema.features.show.dto.ShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ShowController {

    @Autowired
    private ShowService showService;


    @GetMapping("/shows/{showId}")
    ShowDto getShow(@PathVariable Long showId){
    return showService.getShowById(showId);
    }

    @PatchMapping("/shows/{showId}/seats/{seatId}")
    SeatWithPricesDto selectSeat(@PathVariable Long showId, @PathVariable Long seatId){
        return showService.selectSeat(showId, seatId);
    }
}
