package com.yyds.controller;

import com.yyds.entity.ReportedInfo;
import com.yyds.service.ReportedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/accident")
public class AccidentController {

    @Resource
    ReportedInfoService reportedInfoService;

    @RequestMapping("/addReportedInfo")
    public String addReportedInfo(@RequestBody ReportedInfo reportedInfo){
        int count = reportedInfoService.addReportedInfo(reportedInfo);
        return  count>0?"添加成功":"添加失败";
    }
}
