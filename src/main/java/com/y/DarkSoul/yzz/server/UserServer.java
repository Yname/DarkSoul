package com.y.DarkSoul.yzz.server;

import com.y.DarkSoul.yzz.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface UserServer {
    User Login(String id, String name, String password);
    Object register(Long id,String name,String password,String sex,String email);
}
