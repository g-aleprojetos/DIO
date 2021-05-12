package com.github.galeprojetos.citiesapi.countries.repository;

import com.github.galeprojetos.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
