package com.REST.cinema.features.show;


import com.REST.cinema.features.show.dto.ShowDto;
import com.REST.cinema.features.show.dto.ShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    public ShowDto getShowById(Long id){
        Show show = showRepository.findById(id).get();
        return ShowMapper.map(show);
    }


}
