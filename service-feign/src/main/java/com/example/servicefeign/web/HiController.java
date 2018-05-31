package com.example.servicefeign.web;

import com.example.servicefeign.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: zhangtong
 * Date: 2018/5/17
 * Time: 10:53
 */
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
