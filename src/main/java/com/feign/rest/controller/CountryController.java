package com.feign.rest.controller;

import com.feign.rest.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CountryController {

    private final CountryService countryService;
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/rest/getCountryDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCountryDetails(){
        log.info("STARTED REST API TO CALL COUNTRY DETAILS");
        String countryDetails = countryService.getCountryDetails();
        log.info("COMPLETED REST API TO CALL COUNTRY DETAILS");
        return ResponseEntity.ok(countryDetails);
    }
}
