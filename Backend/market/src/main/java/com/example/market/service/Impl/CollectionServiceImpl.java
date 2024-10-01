package com.example.market.service.Impl;

import com.example.market.dto.CollectionDto;
import com.example.market.entity.Collection;
import com.example.market.mapper.CollectionMapper;
import com.example.market.repository.CollectionRepository;
import com.example.market.service.CollectionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CollectionServiceImpl implements CollectionService {

    private final CollectionRepository collectionRepository;
    private final CollectionMapper collectionMapper;

    @Override
    public CollectionDto createCollection(CollectionDto collectionDto) {
        Collection collection = collectionMapper.collectionDtoToCollection(collectionDto);
        return collectionMapper.collectionToCollectionDto(collectionRepository.save(collection));
    }

    @Override
    public List<CollectionDto> getAllCollections() {
        return collectionMapper.listCategoryDtoToCategoryList(
                collectionRepository.findAll()
        );
    }
}
