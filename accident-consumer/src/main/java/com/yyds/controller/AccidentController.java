package com.yyds.controller;

import com.yyds.entity.ReportedInfo;
import com.yyds.service.ReportedInfoClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/accident")
@CrossOrigin(origins = "http://localhost:8888")
public class AccidentController {

    @Autowired
    ReportedInfoClientService reportedInfoClientService;
    @PostMapping(value = "/addReportedInfo")
    public String addReportedInfo( ReportedInfo reportedInfo){
        return   reportedInfoClientService.addReportedInfo(reportedInfo);
    }


}
