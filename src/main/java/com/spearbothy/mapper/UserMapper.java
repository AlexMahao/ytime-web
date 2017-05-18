package com.spearbothy.mapper;

import com.spearbothy.domain.User;

import java.util.List;

/**
 * Created by Alex_MaHao on 2017/5/17.
 */
public interface UserMapper {

    public List<User> findUsers();

    public User findUserById(String id);
}
