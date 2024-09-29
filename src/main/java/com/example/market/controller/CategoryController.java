package com.example.market.controller;

import com.example.market.dto.CategoryCreateDto;
import com.example.market.dto.CategoryDto;
import com.example.market.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.market.api.PathConstants.API_V1_CATEGORIES;

@RestController
@RequestMapping(API_V1_CATEGORIES)
@RequiredArgsConstructor
@Tag(name = "Category", description = "Category API")
public class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CategoryService categoryService;

    @PostMapping
    @Operation(summary = "Create a new category", description = "Creates a new category")
    @ApiResponse(responseCode = "201", description = "Category created successfully")
    public ResponseEntity<CategoryDto> create(@RequestBody CategoryCreateDto categoryDto) {
        logger.info("Creating new category: {}", categoryDto.getName());
        CategoryDto createdCategory = categoryService.create(categoryDto);
        logger.info("Category created successfully: {}", createdCategory.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
    }

    @GetMapping
    @Operation(summary = "Get all categories", description = "Retrieves all categories")
    @ApiResponse(responseCode = "200", description = "Categories retrieved successfully")
    public ResponseEntity<List<CategoryDto>> findAll() {
        logger.info("Fetching all categories");
        List<CategoryDto> categories = categoryService.findAll();
        logger.info("Categories fetched successfully: {}", categories.size());
        return ResponseEntity.ok(categories);
    }

}
