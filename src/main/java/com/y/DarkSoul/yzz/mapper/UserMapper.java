package com.y.DarkSoul.yzz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.y.DarkSoul.yzz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User queryByUserId(Object userId);


}
