package com.y.DarkSoul.yzz.server.impl;

import com.y.DarkSoul.yzz.entity.User;
import com.y.DarkSoul.yzz.entity.UserEquip;
import com.y.DarkSoul.yzz.mapper.UserEquipMapper;
import com.y.DarkSoul.yzz.mapper.UserMapper;
import com.y.DarkSoul.yzz.server.UserEquipServer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Component
public class UserEquipServerImpl implements UserEquipServer {
    @Resource
    private UserEquipMapper userEquipMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserEquip userEquip;

    public Object addEquip(int eId, String uId){
//        String idemail = (String) session.getAttribute("IDEMAIL");
//        Object idemail1 = session.getAttribute("IDEMAIL");
//        System.out.println(idemail1);
//        System.out.println(idemail);
        User user = userMapper.queryByUserId(uId);
        if (user == null){
            return null;
        }
        System.out.println(user.getId());
        userEquip.setUserId(user.getId()); //user 表的id（主键）
        userEquip.setEquipId(eId);
        return userEquipMapper.insert(userEquip);
    }


    public Object queryAllByUserId(String uId){
        User user = userMapper.queryByUserId(uId);
        if (user == null){
            return null;
        }
        List<UserEquip> userEquips = userEquipMapper.queryAllByUserId(user.getId());
        System.out.println(userEquips);
        return userEquips;
    }
}
