package com.REST.cinema.features.show;


import com.REST.cinema.features.pricelist.PriceListItemsPricesRepository;
import com.REST.cinema.features.pricelist.Pricelist;
import com.REST.cinema.features.pricelist.PricelistItemsPrices;
import com.REST.cinema.features.screen.ScreenService;
import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.seat.SeatRepository;
import com.REST.cinema.features.seat.dto.SeatWithPricesDto;
import com.REST.cinema.features.seat.dto.SeatListDto;
import com.REST.cinema.features.seat.dto.SeatMapper;
import com.REST.cinema.features.show.dto.ShowDto;
import com.REST.cinema.features.show.dto.ShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    ScreenService screenService;

    @Autowired
    PriceListItemsPricesRepository priceListItemsPricesRepository;

    public ShowDto getShowById(Long id){

        Show show = showRepository.findById(id).get();

        ShowDto showDto = ShowMapper.map(show);
        showDto.setScreen(getShowSeatChart(show));
        return showDto;
    }

    public SeatListDto[][] getShowSeatChart(Show show) {

        Seat[][] seats = screenService.screenToArray(show.getScreen());
        SeatListDto[][] seatsDto = new SeatListDto[seats.length][seats[0].length];

        for(int i = 0; i<seatsDto.length; i++) {
            for(int j = 0; j<seatsDto[0].length; j++) {
                seatsDto[i][j] = SeatMapper.mapToSeatListDto(seats[i][j]);
                if(isSeatOccupied(seats[i][j], show)) {
                    seatsDto[i][j].setOccupied(true);
                }

            }
        }
        return seatsDto;
    }

    public boolean isSeatOccupied(Seat seat, Show show) {
        return show.getOccupiedSeats().contains(seat);
    }

    @Transactional
    public SeatWithPricesDto selectSeat(long showId, long seatId) {

        Show show = showRepository.findById(showId).get();
        Seat seat = seatRepository.findById(seatId).get();

        Pricelist pricelist = show.getPricelist();

        List<PricelistItemsPrices> prices = priceListItemsPricesRepository.findAllByPricelistIdAndSeatTypeId(pricelist.getId(), seat.getSeatType().getId());
        Map<String, Double> tickets = new HashMap<String, Double>();

        prices.forEach(e -> {
            tickets.put(e.getItem().getPriceItemName(), e.getPrice());
        });

        SeatWithPricesDto seatWithPricesDto = SeatMapper.mapToSeatWithPricesDto(seat);
        seatWithPricesDto.setPrices(tickets);

        List<Seat> ocuppiedSeats = show.getOccupiedSeats();
        ocuppiedSeats.add(seat);
        show.setOccupiedSeats(ocuppiedSeats);

        return seatWithPricesDto;
    }
}