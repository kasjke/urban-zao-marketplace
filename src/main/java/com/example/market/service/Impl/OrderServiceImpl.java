package com.example.market.service.Impl;

import com.example.market.dto.OrderDto;
import com.example.market.entity.Customer;
import com.example.market.entity.Order;
import com.example.market.entity.OrderItem;
import com.example.market.entity.ShippingInfo;
import com.example.market.exception.CustomerNotFound;
import com.example.market.exception.OrderNotFound;
import com.example.market.exception.ShippingInfoNotFound;
import com.example.market.mapper.OrderItemMapper;
import com.example.market.mapper.OrderMapper;
import com.example.market.repository.CustomerRepository;
import com.example.market.repository.OrderRepository;
import com.example.market.repository.ShippingInfoRepository;
import com.example.market.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;
    private ShippingInfoRepository shippingInfoRepository;
    private OrderItemMapper orderItemMapper;
    private OrderMapper orderMapper;
    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = orderMapper.orderDtoToEntity(orderDto);

        Customer customer = customerRepository.findById(orderDto.getCustomer().getId())
                .orElseThrow(CustomerNotFound::new);
        order.setCustomer(customer);
        ShippingInfo shippingInfo = shippingInfoRepository.findById(orderDto.getShippingInfo().getId())
                .orElseThrow(ShippingInfoNotFound::new);
        order.setShippingInfo(shippingInfo);
        List<OrderItem> orderItems = orderItemMapper.orderItemDtoToEntity(orderDto.getItems());
        order.setItems(orderItems);
        orderRepository.save(order);
        return orderMapper.orderToOrderDto(order);
    }


    @Override
    public OrderDto getOrderById(long id) {
        Order order = orderRepository.findById(id).orElseThrow(OrderNotFound::new);
        return orderMapper.orderToOrderDto(order);
    }
}
