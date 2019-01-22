package com.developer.jyong.ctrlweb.controller;

import com.developer.jyong.ctrlweb.pojo.User;
import com.developer.jyong.ctrlweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam(value = "username") String mail,
                              @RequestParam("password") String password) {

        ModelAndView model = new ModelAndView();
        model.setViewName("error");

        try {
            if (!StringUtils.isEmpty(mail) &&
                    !StringUtils.isEmpty(password)) {

                User user = userService.findUserByMail(mail);

                if (user != null) {
                    if (user.getPassword().equals(password)) {
                        model.addObject("username", mail);
                        model.addObject("password", password);
                        model.setViewName("loginSuccess");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
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
