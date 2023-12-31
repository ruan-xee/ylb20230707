package com.rxee.dataservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan(basePackages = "com.rxee.dataservice.mapper")
public class MicrDataserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrDataserviceApplication.class, args);
    }

}
