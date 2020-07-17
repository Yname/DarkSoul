//package com.y.DarkSoul.yzz.util;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StreamUtils;
//import org.springframework.util.StringUtils;
//
//import java.util.Date;
//
//@Slf4j
////@Data
////@Component
////@ConfigurationProperties(prefix = "markerhub.jwt")
//public class JwtUtils {
//
//    private String secret;
//    private long expire;
//    private String header;
//    public String generateToken(long userId){
//        Date nowDate = new Date();
//        Date expireDate = new Date(nowDate.getTime()+expire*1000);
//        return Jwts.builder().setHeaderParam("typ","Jwt").setSubject(userId+"")
//                .setIssuedAt(nowDate).setExpiration(expireDate).signWith(SignatureAlgorithm.HS512,secret).compact();
//    }
//
//    public Claims getClaimsToken(String token){
//        try {
//            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//        }catch (Exception e){
//            log.debug("验证失效"+e);
//            return null;
//        }
//    }
//
//    public boolean isTokenExpired(Date expiration){return expiration.before(new Date());}
//}
