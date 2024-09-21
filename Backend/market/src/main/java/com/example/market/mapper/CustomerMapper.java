package com.example.market.mapper;

import com.example.market.dto.CustomerDto;
import com.example.market.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {CartMapper.class, OrderMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CustomerMapper {

    CustomerDto customerEntityToDto(Customer customer);
    Customer customerDtoToEntity(CustomerDto customerDto);
    void customerDtoToEntity(CustomerDto customerDto, @MappingTarget Customer customer);
}
