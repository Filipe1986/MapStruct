package com;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
    CountryDTO toDTO(Country country);


    Country fromDTO(CountryDTO countryDTO);
}
