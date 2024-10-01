package com.example.market.service;

import com.example.market.dto.CollectionDto;

import java.util.List;

public interface CollectionService {
    CollectionDto createCollection(CollectionDto collectionDto);
    List<CollectionDto> getAllCollections();
}
