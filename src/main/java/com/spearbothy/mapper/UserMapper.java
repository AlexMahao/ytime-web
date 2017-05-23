package com.spearbothy.mapper;

import com.spearbothy.domain.User;

import java.util.List;

/**
 * Created by Alex_MaHao on 2017/5/17.
 */
public interface UserMapper {

    // 添加用户
    public void addUser(User user);

    public User findUserById(String id);


    public void findUserByOpenid(String openId);

}
