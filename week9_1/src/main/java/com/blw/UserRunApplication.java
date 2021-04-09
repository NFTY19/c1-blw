package com.blw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.blw.dao") // mybatis 的注解 把当前包下的类进行管理并 加入IOC容器
@SpringBootApplication
public class UserRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserRunApplication.class);
    }
}
