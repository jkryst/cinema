package com.REST.cinema.features.show.dto;

import com.REST.cinema.features.seat.Seat;
import com.REST.cinema.features.seat.SeatType;
import com.REST.cinema.features.seat.dto.SeatDto;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class ShowDto {

    String movieTitle;

    LocalDate date;

    LocalTime time;

    SeatDto[][] screen;

}
