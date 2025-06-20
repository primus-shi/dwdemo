package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService UserService;
    @RequestMapping("/getAllUser")
    @ResponseBody
    public Map<String,Object> getLb(String page, String limit) {
        return UserService.getUserByPages(page, limit);
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public Map<String,Object> UpdateUser(User user){

        return UserService.updateUser(user);
    }
    @RequestMapping("/addUser")
    @ResponseBody
    public Map<String,Object> addUsers(User user) {
        return UserService.addUsers(user);
    }
}
