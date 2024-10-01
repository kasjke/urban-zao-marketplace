package com.example.market.mapper;

import com.example.market.dto.CollectionDto;
import com.example.market.entity.Collection;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface CollectionMapper {
    CollectionDto collectionToCollectionDto(Collection collection);
    Collection collectionDtoToCollection(CollectionDto collectionDto);
    List<CollectionDto> listCategoryDtoToCategoryList(List<Collection> collections);

}
