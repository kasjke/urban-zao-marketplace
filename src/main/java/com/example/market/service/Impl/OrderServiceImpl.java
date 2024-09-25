package com.example.market.service.Impl;

import com.example.market.dto.OrderDto;
import com.example.market.entity.Order;
import com.example.market.exception.OrderNotFound;
import com.example.market.mapper.OrderMapper;
import com.example.market.repository.OrderRepository;
import com.example.market.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    @Lazy
    private OrderMapper orderMapper;

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = new Order();
       OrderDto newOrderDto= orderMapper.orderToOrderDto(order);
        orderRepository.save(order);
        return newOrderDto;
    }

    @Override
    public OrderDto getOrderById(long id) {
        Order order = orderRepository.findById(id).orElseThrow(OrderNotFound::new);
        return orderMapper.orderToOrderDto(order);
    }
}
