package com.y.DarkSoul.yzz.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.y.DarkSoul.yzz.entity.User;
import com.y.DarkSoul.yzz.mapper.UserMapper;
import com.y.DarkSoul.yzz.server.UserServer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class UserImpl implements UserServer {
    @Resource
    private UserMapper userMapper;

    @Resource
    private User user;

    public User Login(String id,String name,String password){

        User user1 = userMapper.queryByUserId(id);
        if (user1 == null){
            return null;
        }
        if (user1.getUserName().equals(name) && user1.getUserPassword().equals(password)){
            return user1;
        }

        return null;
    }

    public Object register(Long id,String name,String password,String sex,String email){

        User user1 = userMapper.queryByUserId(id);
        if (user1 != null){
            return null;
        }
        User user2 = userMapper.queryByUserId(email);
        if (user2 != null){
            return null;
        }
        this.user.setUserId(id);
        this.user.setUserName(name);
        this.user.setUserPassword(password);
        this.user.setSex(sex);
        this.user.setEmail(email);
        return userMapper.insert(this.user);
    }

}
