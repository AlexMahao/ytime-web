package com.spearbothy.service;

import com.spearbothy.domain.User;
import com.spearbothy.mapper.UserMapper;
import com.spearbothy.utils.MD5Util;
import com.spearbothy.utils.StringUtil;
import com.spearbothy.web.exception.BussinessException;
import com.spearbothy.web.exception.ParamsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

/**
 * Created by Alex_MaHao on 2017/5/18.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 注册通过用户名
     */
    public User registerByName(String name, String password) {
        if (!StringUtil.isName(name)) {
            throw new BussinessException("用户名不合法");
        }

        if (!StringUtil.isPassword(password)) {
            throw new BussinessException("密码不合法");
        }
        if (userMapper.findUserByName(name) != null) {
            throw new BussinessException("用户名已存在");
        }
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName(name);
        user.setPassword(MD5Util.toMD5(password));
        userMapper.addUser(user);
        user = userMapper.findUserById(user.getId());
        return user;
    }

    /**
     * 通过qq授权注册
     */
    public User registerByOpenId(String openId, String nickName, String accessToken) {
        if (StringUtil.isEmpty(openId) || StringUtil.isEmpty(nickName) || StringUtil.isEmpty(accessToken)) {
            throw new BussinessException("授权登陆参数不完整");
        }
        User user;
        user = userMapper.findUserByOpenid(openId);
        if (user != null) {
            return user;
        }
        user = new User();
        user.setOpenid(openId);
        user.setAccessToken(accessToken);
        user.setNickName(nickName);
        user.setId(UUID.randomUUID().toString());
        userMapper.addUser(user);
        user = userMapper.findUserByOpenid(user.getOpenid());
        return user;
    }

    public User loginByName(String name, String password) {
        if (!StringUtil.isName(name)) {
            throw new BussinessException("用户名不合法");
        }

        if (!StringUtil.isPassword(password)) {
            throw new BussinessException("密码不合法");
        }
        User user = new User();
        user.setName(name);
        user.setPassword(MD5Util.toMD5(password));
        user = userMapper.findUserByNameAndPassword(user);
        if (user == null) {
            throw new BussinessException("登陆失败，请检查用户名和密码");
        }
        return user;
    }

    public User loginByOpenid(String openid) {
        if (StringUtil.isEmpty(openid)) {
            throw new BussinessException("授权错误");
        }
        User user = userMapper.findUserByOpenid(openid);
        if (user == null) {
            throw new BussinessException("登陆失败，用户授权错误");
        }
        return user;
    }

    public User refreshUserInfo(String id) {
        if (StringUtil.isEmpty(id)) {
            throw new BussinessException("参数不合法");
        }

        User user = userMapper.findUserById(id);
        if (user == null) {
            throw new BussinessException("刷新用户信息失败");
        }
        return user;
    }
}
