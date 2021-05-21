package com.yyds.controller;

import com.yyds.entity.Menus;
import com.yyds.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenusController {
    @Autowired
    MenusService menusService;
    @RequestMapping("/getMenus")
    public List<Menus> getMenus(int uid){
       return menusService.selectMenusById(uid);
    }
}
