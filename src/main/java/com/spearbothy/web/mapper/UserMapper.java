package com.spearbothy.web.mapper;

import com.spearbothy.web.domain.User;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by Alex_MaHao on 2017/5/17.
 */
public interface UserMapper {

    public List<User> findUsers();

    public User findUserById(String id);
}
