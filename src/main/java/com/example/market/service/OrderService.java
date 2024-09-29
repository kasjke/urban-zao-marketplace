package com.example.market.service;

import com.example.market.dto.OrderDto;

public interface  OrderService {
    OrderDto createOrder(OrderDto orderDto);
    OrderDto getOrderById(long id);
}
