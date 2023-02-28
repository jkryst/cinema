package com.REST.cinema.features.show.dto;

import com.REST.cinema.features.show.Show;

public class ShowMapper {


    public static ShowDtoWithGrid mapToShowDtoWithGrid(Show show) {

        return ShowDtoWithGrid.builder()
                .movieTitle(show.getMovie().getTitle())
                .time(show.getTime())
                .date(show.getDate())
                .screenNum((int) show.getScreen().getId())
                .build();

    }

    public static ShowDto mapToShowDto(Show show) {

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
