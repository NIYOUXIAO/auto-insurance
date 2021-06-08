package com.yyds.controller;

import com.yyds.entity.Warranty;
import com.yyds.service.WarrantyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/warrantys")
public class WarrantyController {
    @Autowired
    WarrantyService warrantyService;

    @RequestMapping("/selectwarranty")
    public List<Warranty> selectwarranty(){
        return warrantyService.selectwarranty();
    }

    @RequestMapping("/getBywarrantyNumber")
    public Warranty getBywarrantyNumber(String warrantyNumber){
        return warrantyService.selectByWarrantyNumber(warrantyNumber);
    }
}
