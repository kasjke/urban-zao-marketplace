package com.example.market.service.Impl;

import com.example.market.dto.CategoryCreateDto;
import com.example.market.dto.CategoryDto;
import com.example.market.entity.Category;
import com.example.market.exception.CategoryNotFound;
import com.example.market.mapper.CategoryMapper;
import com.example.market.repository.CategoryRepository;
import com.example.market.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryDto create(CategoryCreateDto categoryDto) {
        Category category = new Category();

        if(categoryDto.getParentCategoryId() != null) {
            Category parent = categoryRepository.findById(categoryDto.getParentCategoryId()).orElseThrow(CategoryNotFound::new);
            category.setParentCategory(parent);
        }
        category.setName(categoryDto.getName());
        category = categoryRepository.save(category);
        return categoryMapper.categoryToCategoryDto(category);
    }

    @Override
    public List<CategoryDto> findAll() {
        List<Category> categoryList = categoryRepository.findAll();
        return categoryMapper.listCategoryDtoToCategoryList(categoryList);
    }

    @Override
    public CategoryDto findById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(CategoryNotFound::new);
        return categoryMapper.categoryToCategoryDto(category);
    }
}
