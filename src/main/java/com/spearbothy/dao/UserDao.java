package com.spearbothy.dao;

import com.spearbothy.domain.User;
import com.spearbothy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alex_MaHao on 2017/5/17.
 */
@Repository
public class UserDao implements Serializable {

    @Autowired
    private UserMapper userMapper;


    public User findUserById(String id){
        return userMapper.findUserById(id);
    }


}
