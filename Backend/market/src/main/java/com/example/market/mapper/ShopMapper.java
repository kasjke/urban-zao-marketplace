package com.example.market.mapper;

import com.example.market.dto.OrderDto;
import com.example.market.dto.ShopDto;
import com.example.market.entity.Order;
import com.example.market.entity.Shop;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShopMapper {
    ShopDto shopToshopDto(Shop shop);
    Shop shopDtoToShop(ShopDto shopDto);
}
