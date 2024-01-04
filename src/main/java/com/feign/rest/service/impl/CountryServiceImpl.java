package com.feign.rest.service.impl;

import com.feign.rest.client.APIClient;
import com.feign.rest.service.CountryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;


@Service
@Slf4j
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private APIClient apiClient;

    @Override
    public String getCountryDetails() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        log.info("Get Full Country Details Service Call Started");
        String fullCountryResponse = apiClient.getFullCountryDetails();
        stopWatch.stop();
        log.info("Received Full Country Details Service Response {} {}", fullCountryResponse, stopWatch.getTotalTimeMillis());
        return fullCountryResponse;
    }
}
