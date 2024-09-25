package com.example.market.mapper;


import com.example.market.dto.ImageDto;
import com.example.market.entity.Image;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMapper {
    ImageDto imageEntityToDto(Image image);
    Image imageDtoToEntity(ImageDto imageDto);
}
