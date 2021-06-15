package com.yyds.controller;

<<<<<<< HEAD
import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.entity.Warranty;
import com.yyds.entity.warrantytype;
import com.yyds.service.CustomerClientService;
=======
import com.yyds.entity.Warranty;
>>>>>>> origin/master
import com.yyds.service.WarrantyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8888")
@RequestMapping("/getWarranty")
public class WarrantyController {
    @Autowired
    WarrantyClientService warrantyClientService;

    @RequestMapping("/selectAll2")
    public List<Recognizee> selectRecognizee(){
        return warrantyClientService.selectRecognizee();
    }

    @RequestMapping("/selectAlltype")
    List<warrantytype> selectwarrantytype(String warrantyNumber){
        return warrantyClientService.selectwarrantytype(warrantyNumber);
    }

    @RequestMapping("/selectAll3")
    List<Warranty> selectwarranty() {
        return warrantyClientService.selectwarranty();
    }

<<<<<<< HEAD
    @RequestMapping("/selectAllone")
    List<Warranty> selectwarrantyone(int recognizee){
        System.out.println(recognizee);
        return warrantyClientService.selectwarrantyone(recognizee);
    }

    @PostMapping(value="/addWarr")
    public int addWarranty(Warranty warranty){
        return warrantyClientService.addWarranty(warranty);
    }

    @PostMapping(value="/addWarrtype")
    public int addWarrantytype(warrantytype warrantytype){
        return warrantyClientService.addWarrantytype(warrantytype);
    }

    @PostMapping (value="/updateWarr")
    public int updateWarranty(Warranty warranty){
=======
    @RequestMapping("/getBywarrantyNumber/{warrantyNumber}")
    Warranty getBywarrantyNumber(@PathVariable String warrantyNumber) {
        return warrantyClientService.getBywarrantyNumber(warrantyNumber);
    }

    @PostMapping(value = "/addWarr")
    public int addWarranty(Warranty warranty) {
        return warrantyClientService.addWarranty(warranty);
    }

    @PostMapping(value = "/updateWarr")
    public int updateWarranty(Warranty warranty) {
>>>>>>> origin/master
        return warrantyClientService.updateWarranty(warranty);
    }

    @PostMapping (value="/updateWarrxu")
    public int updateWarrantyxu(Warranty warranty){
        return warrantyClientService.updateWarrantyxu(warranty);
    }
}
