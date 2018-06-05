package com.example.serviceconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient client;

    public String hiService(String name) {
        ServiceInstance instance = client.choose("service-hi");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}
