package com.spearbothy.web.controller;

import com.spearbothy.domain.User;
import com.spearbothy.service.UserService;
import com.spearbothy.web.exception.BaseException;
import com.spearbothy.web.exception.ParamsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String findUser(@RequestParam(required = true) int  t,@RequestParam int code){
        if(code==1){
            throw new BaseException();
        }else if( code ==2){
            throw new ParamsException();
        }
        return "";
    }

}
