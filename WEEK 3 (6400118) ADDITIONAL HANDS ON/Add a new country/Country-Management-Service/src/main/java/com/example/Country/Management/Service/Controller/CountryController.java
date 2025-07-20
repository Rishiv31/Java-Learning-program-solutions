package com.example.Country.Management.Service.Controller;

import com.example.Country.Management.Service.CountryService.countryservice;
import com.example.Country.Management.Service.Entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private countryservice service;

    @GetMapping
    public List<Country> getAllCountries() {
        return service.getAllCountries();
    }

   
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        System.out.println("Fetching country with code: " + code);
        return service.findByCode(code);
    }


    @PostMapping
    public Country add(@RequestBody Country country) {
        return service.addCountry(country);
    }


    @PutMapping("/{code}")
    public Country update(@PathVariable String code, @RequestBody Country updated) {
        return service.updateCountry(code, updated);
    }

   
    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        service.deleteCountry(code);
    }

    @GetMapping("/search")
    public List<Country> search(@RequestParam String name) {
        return service.findByPartialName(name);
    }
}
