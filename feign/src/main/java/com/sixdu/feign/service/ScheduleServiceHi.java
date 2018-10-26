package com.sixdu.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client",fallback = ScheduleServiceHiHystric.class)
public interface ScheduleServiceHi {

    @GetMapping(value = "hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
