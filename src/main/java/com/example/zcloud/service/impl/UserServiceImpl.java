package com.example.zcloud.service.impl;

import com.example.zcloud.entity.User;
import com.example.zcloud.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfo() {
        User user = new User();
        user.setName("TestName123");
        user.setPassword(12345678);
        return user;
    }
}
