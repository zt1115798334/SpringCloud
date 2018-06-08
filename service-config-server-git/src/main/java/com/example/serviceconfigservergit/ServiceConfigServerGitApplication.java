package com.example.serviceconfigservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ServiceConfigServerGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigServerGitApplication.class, args);
    }
}
