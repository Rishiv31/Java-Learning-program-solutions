package com.cognizant.springlearn.Controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        Country country = countryService.getCountry(code);

        if (country == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(country);
    }
}
