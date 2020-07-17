package com.y.DarkSoul.yzz.controller;

import com.y.DarkSoul.yzz.common.Result;
import com.y.DarkSoul.yzz.entity.Equip;
import com.y.DarkSoul.yzz.mapper.EquipMapper;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/Equip")
//@CrossOrigin(allowCredentials = "true")
public class EquipController {

    @Resource
    private EquipMapper equipMapper;

    @Resource
    private Equip equip;

    @RequestMapping("/insert")
    public Result insert(){
        equip.setEquipName("黑暗");
        equip.setEquipDes("黑骑士专属的长剑！");
        int insert = equipMapper.insert(equip);
        return Result.suc(insert);
    }

    @GetMapping("/get")
//    @CrossOrigin(allowCredentials = "true")
    public Object get(){
//        return equipMapper.selectById(1);
//        System.out.println(equip);
//        return equipMapper.selectList(null);

        return Result.suc(equipMapper.selectList(null));
    }





//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    @RequestBody //前端传的json  后端用这个注解接受json  默认都是字符串
//    @CrossOrigin
//    @PostMapping("/login")
//    public Object login(int id,String name,String password ){
//
//        System.out.println(id + name + password);
//
//        return null;
//    }


}
