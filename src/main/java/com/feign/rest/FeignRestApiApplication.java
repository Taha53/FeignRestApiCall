package com.feign.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignRestApiApplication.class, args);
    }
}
