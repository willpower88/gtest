package com.powersoft.gtest.service.impl;

import com.powersoft.gtest.mapper.UserMapper;
import com.powersoft.gtest.model.User;
import com.powersoft.gtest.service.UserService;

import java.util.List;

/**
 * Created by didi on 2017/8/1.
 */
public class UserServiceImpl implements UserService{

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public List<User> selectAll() {
        return this.userMapper.selectAll();
    }
}
