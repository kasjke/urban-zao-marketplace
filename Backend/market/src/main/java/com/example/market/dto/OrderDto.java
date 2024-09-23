package com.example.market.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
public class OrderDto {
    private long id;
    private LocalDateTime orderDate;
    private String orderStatus;
    private BigDecimal totalPrice;
    private CustomerDto customer;
    private ShippingInfoDto shippingInfo;
    private List<OrderItemDto> items;
}
