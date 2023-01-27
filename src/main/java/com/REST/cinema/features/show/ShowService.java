package com.REST.cinema.features.show;


import com.REST.cinema.features.screen.ScreenService;
import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.seat.dto.SeatDto;
import com.REST.cinema.features.seat.dto.SeatMapper;
import com.REST.cinema.features.show.dto.ShowDto;
import com.REST.cinema.features.show.dto.ShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    @Autowired
    ScreenService screenService;

    public ShowDto getShowById(Long id){

        Show show = showRepository.findById(id).get();

        ShowDto showDto = ShowMapper.map(show);
        showDto.setScreen(getShowSeatChart(show));
        return showDto;
    }

    public SeatDto[][] getShowSeatChart(Show show) {
        Seat[][] seats = screenService.screenToArray(show.getScreen());
        SeatDto[][] seatsDto = new SeatDto[seats.length][seats[0].length];

        for(int i = 0; i<seatsDto.length; i++) {
            for(int j = 0; j<seatsDto[0].length; j++) {
                seatsDto[i][j] = SeatMapper.map(seats[i][j]);
                if(isSeatOccupied(seats[i][j], show)) {
                    seatsDto[i][j].isOccupied();
                }
            }
        }
        return seatsDto;
    }

    public boolean isSeatOccupied(Seat seat, Show show) {
        return show.getOccupiedSeats().contains(seat);
    }


}
