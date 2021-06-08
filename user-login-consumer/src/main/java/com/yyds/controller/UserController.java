package com.yyds.controller;
import com.yyds.entity.Users;
import com.yyds.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8888")
@RequestMapping("/getUser")
public class UserController {
    @Autowired
    UserClientService userClientService;
    @RequestMapping("/Ulogin/{username}/{userpassword}")
    public Users userLogin(@PathVariable String username , @PathVariable String  userpassword){

        return userClientService.userLogin(username,userpassword);
    }
    @RequestMapping("/getAll")
    public List<Users>  selectUserAll(){

        return userClientService.selectUserAll();
    }
}