package com.y.DarkSoul.yzz.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Equip {

    @TableId(type = IdType.AUTO)
    private int id;
    private String equipName;
    private String equipDes;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private int version;
    @TableLogic
    private int flag;
    private String kind;

}
