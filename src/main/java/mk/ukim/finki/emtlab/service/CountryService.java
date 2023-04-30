package mk.ukim.finki.emtlab.service;

import mk.ukim.finki.emtlab.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();
    Optional<Country> findById(Long id);
    Optional<Country> findByName(String name);
}
