package com.feign.rest.service.impl;

import com.feign.rest.client.APIClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CountryServiceImplTest {

    @Mock
    private APIClient apiClient;

    @InjectMocks
    private CountryServiceImpl countryServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void tearDown() {
        apiClient = null;
        countryServiceImpl = null;
    }

    @Test
    void getCountryDetails() {
        String fullCountryResponse = "{\"fullCountryInfoResult\":{\"languages\":{\"tlanguage\":[{\"sname\":\"Hindi\",\"sisocode\":\"hin\"}]},\"sname\":\"India\",\"sisocode\":\"IN\",\"scapitalCity\":\"New Delhi\",\"scountryFlag\":\"http://www.oorsprong.org/WebSamples.CountryInfo/Flags/India.jpg\",\"sphoneCode\":\"91\",\"scontinentCode\":\"AS\",\"scurrencyISOCode\":\"KD\"}}";
        when(apiClient.getFullCountryDetails()).thenReturn(fullCountryResponse);
        String countryResponse = countryServiceImpl.getCountryDetails();
        assertNotNull(countryResponse);
    }
}