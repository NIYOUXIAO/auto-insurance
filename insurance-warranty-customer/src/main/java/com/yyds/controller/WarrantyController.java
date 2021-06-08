package com.yyds.controller;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Warranty;
import com.yyds.service.WarrantyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(value = "/addwarranty")
    public int addWarranty(@RequestBody Warranty warranty){
        return warrantyService.addWarranty(warranty);
    }

    @PostMapping(value = "/updatewarranty")
    public int updateWarranty(@RequestBody Warranty warranty){
        return warrantyService.updateWarranty(warranty);
    }
}
