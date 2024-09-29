package com.example.market.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopDto {
    private long id;
    private String name;
    private String shortInfo;
    private ImageDto image;
}