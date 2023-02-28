package com.REST.cinema.features.show;


import com.REST.cinema.features.pricelist.*;
import com.REST.cinema.features.screen.ScreenService;
import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.seat.SeatRepository;
import com.REST.cinema.features.seat.dto.SeatWithPricesDto;
import com.REST.cinema.features.seat.dto.SeatOnGridDto;
import com.REST.cinema.features.seat.dto.SeatMapper;
import com.REST.cinema.features.show.dto.ShowDtoWithGrid;
import com.REST.cinema.features.show.dto.ShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    ScreenService screenService;

    @Autowired
    PriceService priceService;

    @Autowired
    PriceRepository priceListItemsPricesRepository;

    public ShowDtoWithGrid getShowDtoById(Long id){

        Show show = showRepository.findById(id).get();

        ShowDtoWithGrid showDtoWithGrid = ShowMapper.mapToShowDtoWithGrid(show);
        showDtoWithGrid.setScreen(getShowSeatChart(show));
        return showDtoWithGrid;
    }

    public Show getShowById(Long id){

        return showRepository.findById(id).get();
    }

    public SeatOnGridDto[][] getShowSeatChart(Show show) {

        Seat[][] seats = screenService.screenToArray(show.getScreen());
        SeatOnGridDto[][] seatsDto = new SeatOnGridDto[seats.length][seats[0].length];

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

        List<Price> prices = priceService.getPrices(show, seat);

        SeatWithPricesDto seatWithPricesDto = SeatMapper.mapToSeatWithPricesDto(seat);
        seatWithPricesDto.setPrices(prices.stream().map(PriceMapper::mapPriceToPriceDto).collect(Collectors.toList()));

        setSeatOccupied(show, seat);

        return seatWithPricesDto;
    }

    public void setSeatOccupied(Show show, Seat seat) {
        List<Seat> ocuppiedSeats = show.getOccupiedSeats();
        ocuppiedSeats.add(seat);
        show.setOccupiedSeats(ocuppiedSeats);
    }

    public void setSeatNotOccupied(Show show, Seat seat) {
        List<Seat> ocuppiedSeats = show.getOccupiedSeats();
        ocuppiedSeats.remove(seat);
        show.setOccupiedSeats(ocuppiedSeats);
    }
}