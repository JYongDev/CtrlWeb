package com.developer.jyong.ctrlweb.controller;

import com.developer.jyong.ctrlweb.pojo.User;
import com.developer.jyong.ctrlweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @ResponseBody
    @RequestMapping("/test")
    public User query() {
        User user = null;
        try {
            user = userService.findUserById(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
