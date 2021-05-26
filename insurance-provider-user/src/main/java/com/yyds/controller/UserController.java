package com.yyds.controller;

import com.yyds.entity.Users;
import com.yyds.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UsersService usersService;
    @RequestMapping("/login")
     public Users Userlogin(String username, String userpassword){
         return usersService.selectUser(username,userpassword);
     }

}
