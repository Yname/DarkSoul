package com.y.DarkSoul.yzz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.y.DarkSoul.yzz.entity.UserEquip;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserEquipMapper extends BaseMapper<UserEquip> {
    List<UserEquip> queryAllByUserId(int id);
}
