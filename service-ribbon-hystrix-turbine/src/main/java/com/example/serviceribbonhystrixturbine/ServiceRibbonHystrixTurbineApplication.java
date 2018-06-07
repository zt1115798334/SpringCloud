package com.example.serviceribbonhystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class ServiceRibbonHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonHystrixTurbineApplication.class, args);
    }
}
