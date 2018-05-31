package com.example.servicefeignhystrix.service;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
