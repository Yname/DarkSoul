//package com.y.DarkSoul.yzz.config;
//
//import com.y.DarkSoul.yzz.shiro.AccountRealm;
//import com.y.DarkSoul.yzz.shiro.JwtFilter;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.mgt.SessionsSecurityManager;
//import org.apache.shiro.session.mgt.SessionManager;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
//import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
//import org.crazycake.shiro.RedisCacheManager;
//import org.crazycake.shiro.RedisSessionDAO;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.Resource;
//import javax.servlet.Filter;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
////@Configuration
//public class ShiroConfig {
//
//    @Resource
//    private JwtFilter jwtFilter;
////    @Bean
//    public SessionManager sessionManager(RedisSessionDAO redisSessionDAO){
//        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
//        sessionManager.setSessionDAO(redisSessionDAO);
//        return sessionManager;
//    }
////    @Bean
//    public SessionsSecurityManager securityManager(AccountRealm realms, SessionManager sessionManager,
//                                                   RedisCacheManager redisCacheManager){
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager(realms);
//        securityManager.setSessionManager(sessionManager);
//        securityManager.setCacheManager(redisCacheManager);
//        return securityManager;
//    }
////    @Bean
//    public ShiroFilterChainDefinition shiroFilterChainDefinition(){
//        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//        Map<String,String> filterMap = new LinkedHashMap<>();
//        filterMap.put("/**","jwt"); //主要通过注解方式校验
//        chainDefinition.addPathDefinitions(filterMap);
//        return chainDefinition;
//    }
////    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager,
//                                                         ShiroFilterChainDefinition shiroFilterChainDefinition){
//        ShiroFilterFactoryBean shiroBean = new ShiroFilterFactoryBean();
//        shiroBean.setSecurityManager(securityManager);
//        Map<String, Filter> filterMap = new HashMap<>();
//        filterMap.put("jwt",jwtFilter);
//        shiroBean.setFilters(filterMap);
//        Map<String,String> filter = shiroFilterChainDefinition.getFilterChainMap();
//        shiroBean.setFilterChainDefinitionMap(filter);
//        return shiroBean;
//
//    }
//
//}
