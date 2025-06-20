package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username} and password = #{password}")
    List<User> selectUserByNameAndPassword(User user);

    @Select("select * from user limit #{page}, #{pageSize}")
    List<User> getUserByPages(@Param("page") int page,@Param("pageSize") int pageSize);

    @Select("select count(*) from user")
    public int getAllUSerCount();

    @Update("UPDATE user set  username = #{username}, password = #{password}, sex = #{sex}, hobby=#{hobby} ,phone = #{phone}  where id = #{id}")
    void updateUser(User user);

    @Insert("INSERT INTO user ( username, password, sex, hobby, phone) VALUES ( #{username}, #{password},#{sex},#{hobby},#{phone})")
    void addUsers(User user);
}
