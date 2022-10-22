package com.example.zcloud.controller;

import com.example.zcloud.entity.User;

import com.example.zcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value = "/getUserItem", method = RequestMethod.GET)
    public String getUserItem() {
        User userInfo = service.getUserInfo();
        return userInfo.toString();
    }

}
