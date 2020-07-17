//package com.y.DarkSoul.yzz.shiro;
//
//import com.y.DarkSoul.yzz.entity.Equip;
//import com.y.DarkSoul.yzz.mapper.EquipMapper;
//import com.y.DarkSoul.yzz.server.EquipServer;
//import com.y.DarkSoul.yzz.util.JwtUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.UnknownAccountException;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.RegEx;
//import javax.annotation.Resource;
//
//
//public class AccountRealm extends AuthorizingRealm {
//
//    @Resource
//    private JwtUtils jwtUtils;
//    @Resource
//    private EquipServer equipServer;
//    @Resource
//    private EquipMapper equipMapper;
//    @Override
//    public boolean supports(AuthenticationToken token) {
//        return token instanceof JwtToken;
//    }
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        return null;
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        JwtToken token1 = (JwtToken) token;
//        String id = jwtUtils.getClaimsToken((String) token1.getPrincipal()).getSubject();
//        Equip equip = equipMapper.selectById(Integer.parseInt(id));
//        if (equip == null){
//            throw new UnknownAccountException("账户不存在！");
//        }
//
//        return null;
//    }
//}
