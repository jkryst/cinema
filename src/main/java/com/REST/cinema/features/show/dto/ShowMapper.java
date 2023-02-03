package com.REST.cinema.features.show.dto;

import com.REST.cinema.features.seat.SeatType;
import com.REST.cinema.features.seat.dto.SeatDto;
import com.REST.cinema.features.seat.dto.SeatMapper;
import com.REST.cinema.features.show.Show;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowMapper {


    public static ShowDto map(Show show) {

        return ShowDto.builder()
                .movieTitle(show.getMovie().getTitle())
                .time(show.getTime())
                .date(show.getDate())
                .build();

    }

    public static ShowDtoList mapToList(Show show) {

        return ShowDtoList.builder()
                .id(show.getId())
                .time(show.getTime().getHour()+":"+show.getTime().getMinute())
                .build();

    }
}
