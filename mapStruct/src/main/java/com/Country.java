package com;

import java.util.Collections;
import java.util.List;

public record Country(String name, List<City> cities) {
    public Country {
        cities = Collections.unmodifiableList(cities);
    }

}
