package com;

import java.util.Collections;
import java.util.List;

public record CountryDTO(String name, List<CityDTO> cities) {
    public CountryDTO {
        cities = Collections.unmodifiableList(cities);
    }
}
