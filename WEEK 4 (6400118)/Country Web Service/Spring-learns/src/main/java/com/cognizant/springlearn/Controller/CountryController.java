package com.cognizant.springlearn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.springlearn.Entity.Country;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private ApplicationContext context;

   @GetMapping
    public Country getCountryIndia() {
        return (Country) context.getBean("in");
    }
}
