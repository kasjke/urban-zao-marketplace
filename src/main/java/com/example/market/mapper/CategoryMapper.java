package com.example.market.mapper;

import com.example.market.dto.CategoryDto;
import com.example.market.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(source = "subCategories", target = "subCategories")
    @Mapping(source = "name", target = "name")
    CategoryDto categoryToCategoryDto(Category category);

    @Mapping(source = "subCategories", target = "subCategories")
    @Mapping(source = "name", target = "name")
    Category categoryDtoToEntity(CategoryDto categoryDto);

    List<CategoryDto> listCategoryDtoToCategoryList(List<Category> categoryList);
}
