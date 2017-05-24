package com.spearbothy.web.controller;

import com.spearbothy.domain.User;
import com.spearbothy.service.UserService;
import com.spearbothy.web.exception.BaseException;
import com.spearbothy.web.exception.ParamsException;
import com.spearbothy.web.response.Result;
import com.spearbothy.web.response.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping(value = "/login/name")
    @ResponseBody
    public Result<User> loginByName(@RequestParam(required = true) String name, @RequestParam(required = true) String password) {
        User user = userService.loginByName(name, password);
        return new Result<User>().setResultCode(ResultCode.SUCCESS).setData(user);
    }

    @RequestMapping(value = "/login/openid")
    @ResponseBody
    public Result<User> loginByOpenid(@RequestParam(required = true) String openid) {
        User user = userService.loginByOpenid(openid);
        return new Result<User>().setResultCode(ResultCode.SUCCESS).setData(user);
    }

    @RequestMapping(value = "/register/openid")
    @ResponseBody
    public Result<User> registerByOpenid(@RequestParam(required = true) String openid,
                                         @RequestParam(required = true) String nickName,
                                         @RequestParam(required = true) String accessToken) {
        User user = userService.registerByOpenId(openid, nickName,accessToken);
        return new Result<User>().setResultCode(ResultCode.SUCCESS).setData(user);
    }

    @RequestMapping(value = "/register/name")
    @ResponseBody
    public Result<User> registerByName(@RequestParam(required = true) String name, @RequestParam(required = true) String password) {
        User user = userService.registerByName(name, password);
        return new Result<User>().setResultCode(ResultCode.SUCCESS).setData(user);
    }

    @RequestMapping(value = "/refresh/id")
    @ResponseBody
    public Result<User> refreshById(@RequestParam(required = true) String id) {
        User user = userService.refreshUserInfo(id);
        return new Result<User>().setResultCode(ResultCode.SUCCESS).setData(user);
    }
}
