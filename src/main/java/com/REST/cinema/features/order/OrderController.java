package com.REST.cinema.features.order;

import com.REST.cinema.features.seat.dto.SeatWithPricesDto;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {

    OrderService orderService;
    @PostMapping("/orders")
    public void createOrder(@RequestBody OrderDto orderDto){
        orderService.createOrder(orderDto);
    }
}
