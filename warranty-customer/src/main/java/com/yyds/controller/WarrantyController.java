package com.yyds.controller;

import com.yyds.entity.Warranty;
import com.yyds.service.WarrantyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/getBywarrantyNumber/{warrantyNumber}")
    Warranty getBywarrantyNumber(@PathVariable String warrantyNumber){
        return warrantyClientService.getBywarrantyNumber(warrantyNumber);
    }
}
