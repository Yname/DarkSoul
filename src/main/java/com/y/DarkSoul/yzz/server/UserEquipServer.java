package com.y.DarkSoul.yzz.server;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public interface UserEquipServer  {
    Object addEquip(int equipId, String IDEMAIL);
    Object queryAllByUserId(String uId);
}
