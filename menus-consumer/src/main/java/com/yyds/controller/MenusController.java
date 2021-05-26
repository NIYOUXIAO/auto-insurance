package com.yyds.controller;

import com.yyds.entity.Menus;
import com.yyds.service.MenusClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8888")
@RequestMapping("/menus")
public class MenusController {
    @Autowired
    MenusClientService menusClientService;

    @RequestMapping("/getMenus/{uid}")
    public List<Menus> getMenus(@PathVariable int uid){

        return  menusClientService.getMenus(uid);
    }
}
