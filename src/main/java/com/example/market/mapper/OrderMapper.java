package com.example.market.mapper;


import com.example.market.dto.OrderDto;
import com.example.market.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrderMapper {

    @Mapping(source = "customer", target = "customer")
    @Mapping(source = "shippingInfo", target = "shippingInfo")
    @Mapping(source = "items", target = "items")
    OrderDto orderToOrderDto(Order order);

    @Mapping(source = "customer", target = "customer")
    @Mapping(source = "shippingInfo", target = "shippingInfo")
    @Mapping(source = "items", target = "items")
    Order orderDtoToEntity(OrderDto orderDto);
}
