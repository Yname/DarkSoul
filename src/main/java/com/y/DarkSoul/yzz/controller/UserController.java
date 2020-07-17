package com.y.DarkSoul.yzz.controller;

import com.y.DarkSoul.yzz.common.Result;
import com.y.DarkSoul.yzz.server.UserServer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;


@RestController
@RequestMapping("/User")
//@CrossOrigin(allowCredentials = "true")
public class UserController {

    @Resource
    private UserServer userServer;
    @Resource
    private Result result;

//    @CrossOrigin(allowCredentials = "true")
    @PostMapping("/login")
    public Object login(String id, String name, String password , HttpSession session){
        return Result.suc(userServer.Login(id, name, password));
    }

//    @CrossOrigin(allowCredentials = "true")
    @PostMapping("/register")
    public Object register(String id,String name,String password,String sex,String email){

        BigInteger bigInteger = new BigInteger(id);
        System.out.println(bigInteger);
        System.out.println(Long.parseLong(id));
        return Result.suc(userServer.register(Long.parseLong(id),name,password,sex,email));
    }

}
