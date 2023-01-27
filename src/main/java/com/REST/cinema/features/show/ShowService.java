package com.REST.cinema.features.show;


import com.REST.cinema.features.screen.ScreenService;
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
        showDto.setScreen(screenService.screenToArray(show.getScreen()));
    }


}
