package com.yyds.controller;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.entity.Warranty;
import com.yyds.entity.warrantytype;
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

<<<<<<< HEAD
    @RequestMapping("/selectwarrantytype")
    public List<warrantytype> selectwarrantytype(String warrantyNumber){
        return warrantyService.selectwarrantytype(warrantyNumber);
    }

    @RequestMapping("/selectwarrantyone")
    public List<Warranty> selectwarrantyone(int recognizee){
        return warrantyService.selectwarrantyone(recognizee);
    }

=======
    @RequestMapping("/getBywarrantyNumber")
    public Warranty getBywarrantyNumber(String warrantyNumber) {
        return warrantyService.selectByWarrantyNumber(warrantyNumber);
    }
>>>>>>> origin/master
    @PostMapping(value = "/addwarranty")
    public int addWarranty(@RequestBody Warranty warranty){
        return warrantyService.addWarranty(warranty);
    }

    @PostMapping(value = "/addwarrantytype")
    public int addWarrantytype(@RequestBody warrantytype warrantytype){
        return warrantyService.addWarrantytype(warrantytype);
    }

    @PostMapping(value = "/updatewarranty")
    public int updateWarranty(@RequestBody Warranty warranty){
        return warrantyService.updateWarranty(warranty);
    }

    @PostMapping(value = "/updatewarrantyxu")
    public int updateWarrantyxu(@RequestBody Warranty warranty){
        return warrantyService.updateWarrantyxu(warranty);
    }

    @RequestMapping("/selectrecognizee")
    public List<Recognizee> selectRecognizee(){
        return warrantyService.selectRecognizee();
    }
}
