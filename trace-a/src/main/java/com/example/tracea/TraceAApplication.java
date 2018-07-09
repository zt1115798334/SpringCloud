package com.example.tracea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class TraceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceAApplication.class, args);
    }

    @Autowired
    private LoadBalancerExchangeFilterFunction filterFunction;

    @Bean
    public WebClient webClient() {
        return WebClient.builder().filter(filterFunction).build();
    }

    @GetMapping("/trace-a")
    public Mono<String> trace() {
        System.out.println("===call trace-a===");
        return webClient().get().uri("http://trace-b").retrieve().bodyToMono(String.class);
    }
}
