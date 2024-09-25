package com.example.market.mapper;

import com.example.market.dto.CustomerDto;
import com.example.market.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CustomerMapper {

    @Mapping(source = "cart", target = "cart")
    @Mapping(source = "orders", target = "orders")
    CustomerDto customerEntityToDto(Customer customer);

    @Mapping(target = "password", ignore = true)
    @Mapping(source = "cart", target = "cart")
    @Mapping(source = "orders", target = "orders")
    Customer customerDtoToEntity(CustomerDto customerDto);

    @Mapping(target = "password", ignore = true)
    @Mapping(source = "cart", target = "cart")
    @Mapping(source = "orders", target = "orders")
    void customerDtoToEntity(CustomerDto customerDto, @MappingTarget Customer customer);
}
