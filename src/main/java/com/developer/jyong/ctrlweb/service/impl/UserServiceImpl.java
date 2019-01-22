package com.developer.jyong.ctrlweb.service.impl;

import com.developer.jyong.ctrlweb.mapper.UserMapper;
import com.developer.jyong.ctrlweb.pojo.User;
import com.developer.jyong.ctrlweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) throws Exception {
        return userMapper.findUserById(id);
    }

    @Override
    public User findUserByMail(String mail) throws Exception {
        return userMapper.findUserByMail(mail);
    }
}
