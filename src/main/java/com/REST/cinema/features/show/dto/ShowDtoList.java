package com.REST.cinema.features.show.dto;

import com.REST.cinema.features.show.Show;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShowDtoList {

    Long id;
    String time;
}
