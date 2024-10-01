package com.example.market.controller;

import com.example.market.dto.CollectionDto;
import com.example.market.service.CollectionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.market.api.PathConstants.API_V1_COLLECTIONS;

@RestController
@RequestMapping(API_V1_COLLECTIONS)
@RequiredArgsConstructor
@Tag(name = "Collection", description = "Collection API")
public class CollectionController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CollectionService collectionService;

    @PostMapping
    @Operation(summary = "Create a new collection", description = "Creates a new collection with the provided details")
    @ApiResponse(responseCode = "201", description = "Collection successfully created")
    public ResponseEntity<CollectionDto> createCollection(@RequestBody CollectionDto collectionDto) {
        logger.info("Creating new collection: {}", collectionDto.getName());
        CollectionDto createdCollection = collectionService.createCollection(collectionDto);
        logger.info("Collection created successfully: {}", createdCollection.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCollection);
    }

    @GetMapping
    @Operation(summary = "Get all collections", description = "Retrieves all collections")
    @ApiResponse(responseCode = "200", description = "Collections retrieved successfully")
    public ResponseEntity<List<CollectionDto>> getAll() {
        logger.info("Fetching all collections");
        List<CollectionDto> collections = collectionService.getAllCollections();
        logger.info("Collections fetched successfully: {}", collections.size());
        return ResponseEntity.ok(collections);
    }
}
