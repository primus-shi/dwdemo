package com.example.demo.service.serviceImpl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.result.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
@Override
    public Map<String, Object> getUsers(User user) {
        List<User> users = userMapper.selectUserByNameAndPassword(user);

        if (users.size() != 0) {
            return Result.success("登录成功");
        }else  {
            return Result.fail("登录失败");
        }

    }
}