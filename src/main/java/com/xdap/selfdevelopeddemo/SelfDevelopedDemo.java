package com.xdap.selfdevelopeddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients()
@ComponentScan(basePackages = {"com.definesys.mpaas", "com.xdap.*"})
@MapperScan("com.xdap.*.mapper")
public class SelfDevelopedDemo {

    public static void main(String[] args) {
        SpringApplication.run(SelfDevelopedDemo.class, args);
    }

}
