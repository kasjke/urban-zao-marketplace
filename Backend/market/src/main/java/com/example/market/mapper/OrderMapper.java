package com.example.market.mapper;


import com.example.market.dto.OrderDto;
import com.example.market.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto orderToOrderDto(Order order);
    Order orderDtoToOrder(OrderDto cartDto);
}
