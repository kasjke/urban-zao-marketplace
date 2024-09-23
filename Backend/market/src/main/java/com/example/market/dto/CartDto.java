package com.example.market.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CartDto {
    private long id;
    private CustomerDto customer;
    private List<CartItemDto> items;
}