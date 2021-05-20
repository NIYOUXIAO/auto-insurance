package com.yyds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启注册中心发现，让注册中心发现并扫描到该服务
public class  UserApp{
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class,args);
    }
}