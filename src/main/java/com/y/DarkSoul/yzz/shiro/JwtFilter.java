//package com.y.DarkSoul.yzz.shiro;
//
//import cn.hutool.json.JSONUtil;
//import com.y.DarkSoul.yzz.common.Result;
//import com.y.DarkSoul.yzz.util.JwtUtils;
//import io.jsonwebtoken.Claims;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.ExpiredCredentialsException;
//import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StreamUtils;
//import org.springframework.util.StringUtils;
//
//import javax.annotation.Resource;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
//public class JwtFilter extends AuthenticatingFilter {
//
//    @Resource
//    private JwtUtils jwtUtils;
//    @Override
//    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) throws Exception {
//        HttpServletRequest servletRequest = (HttpServletRequest) request;
//        String jwt = servletRequest.getHeader("Authorization");
//        if (StringUtils.isEmpty(jwt)){
//            return null;
//        }
//
//        return new JwtToken(jwt);
//    }
//
//    @Override
//    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
//        HttpServletRequest servletRequest = (HttpServletRequest) request;
//        String jwt = servletRequest.getHeader("Authorization");
//        if (StringUtils.isEmpty(jwt)){
//            return true;
//        }else {
////            校验jwt
//            Claims claimsToken = jwtUtils.getClaimsToken(jwt);
//            if (claimsToken == null || jwtUtils.isTokenExpired(claimsToken.getExpiration())){
//                throw new ExpiredCredentialsException("token is expired");
//            }
////            执行登录
//            return executeLogin(request,response);
//        }
//
//    }
//
//    @Override
//    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
//        HttpServletResponse response1 = (HttpServletResponse) response;
//
//        Throwable throwable = e.getCause() ==  null ? e : e.getCause();
//        Result fail = Result.fail(throwable.getMessage());
//
//        String json = JSONUtil.toJsonStr(fail);
//        try {
//            response1.getWriter().print( json);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }
//}
