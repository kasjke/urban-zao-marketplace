package com.example.market.service;

import com.example.market.dto.CategoryCreateDto;
import com.example.market.dto.CategoryDto;
import com.example.market.entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryDto create(CategoryCreateDto categoryDto);
    List<CategoryDto> findAll();
    CategoryDto findById(Long id);
}
