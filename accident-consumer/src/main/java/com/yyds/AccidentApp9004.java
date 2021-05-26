package com.yyds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AccidentApp9004 {

    public static void main(String[] args) {
        SpringApplication.run(AccidentApp9004.class,args);
    }
}
