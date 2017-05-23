package com.spearbothy.service;

import com.spearbothy.dao.UserDao;
import com.spearbothy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alex_MaHao on 2017/5/18.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findUserById(String id){
        return userDao.findUserById(id);
    }
}
