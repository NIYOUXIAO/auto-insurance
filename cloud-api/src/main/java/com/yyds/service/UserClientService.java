package com.yyds.service;

import com.yyds.entity.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "cloud-provider-users",path = "/users")
public interface UserClientService {

    @RequestMapping("/login")
    Users userLogin(@RequestParam("username") String username,@RequestParam("userpassword") String userpassword);
}
