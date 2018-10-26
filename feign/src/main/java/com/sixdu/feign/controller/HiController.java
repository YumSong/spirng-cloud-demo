package com.sixdu.feign.controller;

import com.sixdu.feign.service.ScheduleServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource ScheduleServiceHi scheduleServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name",defaultValue = "Tony") String name) {
        System.out.println("This is Feign");
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
