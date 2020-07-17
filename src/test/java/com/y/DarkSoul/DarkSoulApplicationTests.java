package com.y.DarkSoul;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.y.DarkSoul.yzz.common.Result;
import com.y.DarkSoul.yzz.entity.User;
import com.y.DarkSoul.yzz.entity.UserEquip;
import com.y.DarkSoul.yzz.mapper.UserEquipMapper;
import com.y.DarkSoul.yzz.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DarkSoulApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Resource
    private Result result;
    @Resource
    private UserEquipMapper userEquipMapper;
    @Resource
    private UserEquip userEquip;
    @Test
    void contextLoads() {
//        User user = new User();
//        user.setUserId(123);
//        User user1 = userMapper.selectOne(new QueryWrapper<>(user));

        String email = "12345678910";
        User user = userMapper.queryByUserId(email);
        System.out.println(user);

//        userEquip.setUserId(1);
//        List<UserEquip> userEquips = userEquipMapper.selectList(new QueryWrapper<>(userEquip));

    }

}
