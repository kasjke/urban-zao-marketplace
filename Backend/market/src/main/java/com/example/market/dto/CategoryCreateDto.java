package com.example.market.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryCreateDto {
    private String name;
    private Long parentCategoryId;
}
