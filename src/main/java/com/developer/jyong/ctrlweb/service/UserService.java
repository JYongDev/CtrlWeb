package com.developer.jyong.ctrlweb.service;

import com.developer.jyong.ctrlweb.pojo.User;

public interface UserService {
    User findUserById(int id) throws Exception;

    User findUserByMail(String mail) throws Exception;
}
