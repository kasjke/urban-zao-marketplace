package com.example.market.mapper;

import com.example.market.dto.ProductDto;
import com.example.market.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ShopMapper.class})
public interface ProductMapper {
    ProductDto productToProductDto(Product product);
    Product productDtoToProduct(ProductDto productDto);
}
