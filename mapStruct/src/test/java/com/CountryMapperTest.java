package com;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryMapperTest {

    @Test
    void toDTO() {
        Country country = new Country("India", List.of(new City("Delhi")));
        CountryDTO countryDTO = CountryMapper.INSTANCE.toDTO(country);
        assertEquals("India", countryDTO.name());
        assertEquals("Delhi", countryDTO.cities().getFirst().name());
    }

    @Test
    void toEntity() {
        CountryDTO countryDTO = new CountryDTO("India", List.of(new CityDTO("Delhi")));
        Country country = CountryMapper.INSTANCE.fromDTO(countryDTO);
        assertEquals("India", country.name());
        assertEquals("Delhi", country.cities().getFirst().name() );
    }

}