package com.example.market.mapper;

import com.example.market.dto.CartItemDto;
import com.example.market.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CartItemMapper {
    CartItemDto cartItemToCartItemDto(CartItem cartItem);
    CartItem cartItemDtoToCartItem(CartItemDto cartItemDto);
}
