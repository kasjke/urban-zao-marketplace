package com.example.market.mapper;

import com.example.market.dto.OrderItemDto;
import com.example.market.entity.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrderItemMapper {


    OrderItemDto orderItemEntityToDto(OrderItem orderItem);
    OrderItem orderItemDtoToEntity(OrderItemDto orderItemDto);
    List<OrderItem> orderItemDtoToEntity(List<OrderItemDto> orderItemDtos);
}
