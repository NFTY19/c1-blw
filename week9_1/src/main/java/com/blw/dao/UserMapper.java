package com.blw.dao;

import com.blw.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //用户注册
    boolean register(User user);
    //用户登录
    User login(String mobile, String password);
    //查询用户信息
    User findById(int id);

    User check(String phone);
}