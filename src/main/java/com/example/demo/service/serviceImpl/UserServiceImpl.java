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

    @Override
    public Map<String, Object> getUserByPages(String pages, String size) {
        int page = Integer.parseInt(pages);
        int pageSize = Integer.parseInt(size);
      List<User> users= userMapper.getUserByPages((page-1)*pageSize, pageSize);
      int count = userMapper.getAllUSerCount();
      return Result.success("",count,users);
    }

    @Override
    public Map<String, Object> updateUser(User user) {
        userMapper.updateUser(user);


      return   Result.success("修改成功");
    }

    @Override
    public Map<String, Object> addUsers(User user) {

        userMapper.addUsers(user);
        return Result.success("添加成功");
    }
}