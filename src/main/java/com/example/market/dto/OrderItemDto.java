package com.example.market.dto;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderItemDto {

    private long id;
    private ProductDto product;
    private Integer quantity;
    private BigDecimal price;
}
