package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    UserServiceImpl userServiceImpl;
    @ResponseBody
    @RequestMapping("/login")
    public Map<String, Object> login(User user) {

        return userServiceImpl.getUsers(user);
    }
}
