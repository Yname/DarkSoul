package com.y.DarkSoul.yzz.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserEquip {


    @TableId(type = IdType.AUTO)
    private int id;
    private int equipId;//Equip表中的id，而不是equipId
    private int userId; //User表中的id，而不是userId

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private int version;
    @TableLogic
    private int flag;


}
