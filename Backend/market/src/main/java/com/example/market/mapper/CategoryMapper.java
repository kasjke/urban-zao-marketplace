package com.example.market.mapper;

import com.example.market.dto.CategoryDto;
import com.example.market.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CartMapper.class, OrderMapper.class})
public interface CategoryMapper {
    CategoryDto categoryToCategoryDto(Category category);
    Category categoryDtoToCategory(CategoryDto categoryDto);
    List<CategoryDto> listCategoryDtoToCategoryList(List<Category> categoryList);
}
