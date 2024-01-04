package com.feign.rest.controller;

import com.feign.rest.service.CountryService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CountryControllerTest {

    @Mock
    private CountryService countryService;

    @InjectMocks
    private CountryController countryController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void tearDown() {
        countryService = null;
        countryController = null;
    }

    @Test
    void getCountryDetails() {
        String fullCountryResponse = "{\"fullCountryInfoResult\":{\"languages\":{\"tlanguage\":[{\"sname\":\"Hindi\",\"sisocode\":\"hin\"}]},\"sname\":\"India\",\"sisocode\":\"IN\",\"scapitalCity\":\"New Delhi\",\"scountryFlag\":\"http://www.oorsprong.org/WebSamples.CountryInfo/Flags/India.jpg\",\"sphoneCode\":\"91\",\"scontinentCode\":\"AS\",\"scurrencyISOCode\":\"KD\"}}";
        when(countryService.getCountryDetails()).thenReturn(fullCountryResponse);
        ResponseEntity<String> responseEntity = countryController.getCountryDetails();
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }
}