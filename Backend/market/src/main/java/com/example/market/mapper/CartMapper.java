package com.example.market.mapper;

import com.example.market.dto.CartDto;
import com.example.market.entity.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto cartToCartDto(Cart cart);
    Cart cartDtoToCart(CartDto cartDto);
}
