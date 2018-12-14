package com.developer.jyong.ctrlweb.mapper;


import com.developer.jyong.ctrlweb.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findUserById(int id) throws Exception;
}
