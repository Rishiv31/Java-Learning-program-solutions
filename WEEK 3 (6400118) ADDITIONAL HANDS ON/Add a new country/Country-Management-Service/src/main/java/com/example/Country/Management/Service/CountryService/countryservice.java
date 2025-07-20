package com.example.Country.Management.Service.CountryService;

import com.example.Country.Management.Service.Entity.Country;
import com.example.Country.Management.Service.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class countryservice {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country findByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(String code, Country updated) {
        Optional<Country> existing = countryRepository.findById(code);
        if (existing.isPresent()) {
            Country c = existing.get();
            c.setCoName(updated.getCoName()); // ✅ Correctly update name only
            return countryRepository.save(c);
        }
        return null;
    }

    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> findByPartialName(String name) {
        return countryRepository.findByCoNameContainingIgnoreCase(name);
    }
}
