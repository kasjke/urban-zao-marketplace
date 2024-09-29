package com.example.market.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemDto {
    private long id;
    private ProductDto product;
    private int quantity;
    private double total_price;
}