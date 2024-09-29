package com.example.market.mapper;

import com.example.market.dto.ProductDto;
import com.example.market.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductMapper {
    @Mapping(source = "discount", target = "discount")
    @Mapping(source = "available", target = "available")
    @Mapping(source = "category", target = "category")
    @Mapping(source = "collection", target = "collection")
    ProductDto productEntityToDto(Product product);
    @Mapping(source = "discount", target = "discount")
    @Mapping(source = "available", target = "available")
    @Mapping(source = "category", target = "category")
    @Mapping(source = "collection", target = "collection")
    Product productDtoToEntity(ProductDto productDto);
}
