package com.spearbothy.web.controller;

import com.spearbothy.web.dao.UserDao;
import com.spearbothy.web.domain.User;
import com.spearbothy.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Alex_MaHao on 2017/5/17.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findUsers")
    @ResponseBody
    public List<User> findUser(){
        return userService.findUsers();
    }

}
