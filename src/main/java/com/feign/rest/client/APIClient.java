package com.feign.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "GetFullCountry", url = "http://localhost:9090")
public interface APIClient {
    @GetMapping(value = "/getFullCountry")
    String getFullCountryDetails();
}
