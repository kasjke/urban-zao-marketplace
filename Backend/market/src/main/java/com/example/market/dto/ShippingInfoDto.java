package com.example.market.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class ShippingInfoDto {
    private long id;
    private String shippingAddress;
    private LocalDateTime shippingDate;
    private LocalDateTime deliveryDate;
    private String shippingMethod;
}
