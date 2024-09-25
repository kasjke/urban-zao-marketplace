package com.example.market.mapper;

import com.example.market.dto.CartDto;
import com.example.market.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CartMapper {

    @Mapping(source = "customer", target = "customer")
    @Mapping(source = "items", target = "items")
    CartDto cartEntityToDto(Cart cart);

    @Mapping(source = "customer", target = "customer")
    @Mapping(source = "items", target = "items")
    Cart cartDtoToEntity(CartDto cartDto);
}