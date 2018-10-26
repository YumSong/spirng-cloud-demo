package com.sixdu.client.user.controller;

import com.sixdu.client.user.model.UserDto;
import com.sixdu.client.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user")
    public UserDto getUser(){
        return userService.getUserDto();
    }
}
