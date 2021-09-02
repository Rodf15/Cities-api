package com.github.Rodf15.citiesapi.repository;

import com.github.Rodf15.citiesapi.repository.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
