package com.example.market.mapper;

import com.example.market.dto.CartDto;
import com.example.market.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {ShopMapper.class, CategoryMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CartMapper {
    CartDto cartToCartDto(Cart cart);
    Cart cartDtoToCart(CartDto cartDto);
}
