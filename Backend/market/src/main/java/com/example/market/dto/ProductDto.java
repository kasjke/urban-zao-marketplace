package com.example.market.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
public class ProductDto {
    private long id;
    private String productName;
    private String description;
    private Double rating;
    private BigDecimal price;
    private String image;
    private int stockQuantity;
    private LocalDate timeAdded;
    private String discount;
    private String available;
    private CategoryDto category;
    private CollectionDto collection;
    private ShopDto shop;
}
