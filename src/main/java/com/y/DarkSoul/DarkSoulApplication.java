package com.y.DarkSoul;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.y.DarkSoul.yzz.mapper")

public class DarkSoulApplication {

    public static void main(String[] args) {
        SpringApplication.run(DarkSoulApplication.class, args);
    }

}
