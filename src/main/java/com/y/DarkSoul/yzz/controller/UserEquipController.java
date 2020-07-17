package com.y.DarkSoul.yzz.controller;

import com.y.DarkSoul.yzz.common.Result;
import com.y.DarkSoul.yzz.server.UserEquipServer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
@RequestMapping("/UserEquip")
//@CrossOrigin(allowCredentials = "true")
public class UserEquipController {
    @Resource
    private UserEquipServer userEquipServer;

//    @CrossOrigin(allowCredentials = "true")
    @PostMapping("/addEquip")
    public Object addEquip(int eId, String uId){
        return Result.suc(userEquipServer.addEquip(eId, uId));
    }

    @PostMapping("/queryEquip")
    public Object queryAllByUserId(String uId){
        return Result.suc(userEquipServer.queryAllByUserId(uId));
    }


}
