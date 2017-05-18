package com.spearbothy.web.dao;

import com.spearbothy.web.domain.User;
import com.spearbothy.web.mapper.UserMapper;
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

    public List<User> findUsers(){
        return userMapper.findUsers();
    }

    public User findUserById(String id){
        return userMapper.findUserById(id);
    }


}
