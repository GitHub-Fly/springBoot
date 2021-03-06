package com.soft1851.springboot.aop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xunmi
 */
@SpringBootApplication
@MapperScan("com.soft1851.springboot.aop.mapper")
public class SpringBootAopApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootAopApplication.class, args);
    }

}
