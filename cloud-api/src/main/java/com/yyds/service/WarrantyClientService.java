package com.yyds.service;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.entity.Warranty;
import com.yyds.entity.warrantytype;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@CrossOrigin(origins = "http://localhost:8888")
@FeignClient(value = "cloud-provider-user3",path = "/warrantys")
public interface WarrantyClientService {

    @RequestMapping("/selectrecognizee")
    List<Recognizee> selectRecognizee();

    @RequestMapping("/selectwarrantytype")
    List<warrantytype> selectwarrantytype(@RequestParam("warrantyNumber") String warrantyNumber);

    @RequestMapping("/selectwarrantyone")
    List<Warranty> selectwarrantyone(@RequestParam("recognizee") int recognizee);

    @RequestMapping("/selectwarranty")
    List<Warranty> selectwarranty();

    @RequestMapping("/addwarranty")
    int addWarranty(Warranty warranty);

    @RequestMapping("/addwarrantytype")
    int addWarrantytype(warrantytype warrantytype);

    @RequestMapping("/updatewarranty")
    int updateWarranty(Warranty warranty);

    @RequestMapping("/updatewarrantyxu")
    int updateWarrantyxu(Warranty warranty);
}
