package com.yyds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MenusApp {
    public static void main(String[] args) {
        SpringApplication.run(MenusApp.class,args);
    }

}
