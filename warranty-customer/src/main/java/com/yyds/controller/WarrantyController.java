package com.yyds.controller;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Warranty;
import com.yyds.service.CustomerClientService;
import com.yyds.service.WarrantyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8888")
@RequestMapping("/getWarranty")
public class WarrantyController {
    @Autowired
    WarrantyClientService warrantyClientService;

    @RequestMapping("/selectAll3")
    List<Warranty> selectwarranty(){
        return warrantyClientService.selectwarranty();
    }
}
