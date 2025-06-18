package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    Map<String,Object> getUsers(User user);
}
