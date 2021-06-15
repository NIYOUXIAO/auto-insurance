package com.yyds.controller;

import com.yyds.entity.ReportedInfo;
import com.yyds.service.ReportedInfoService;
import com.yyds.service.UsertoaccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/accident")
public class AccidentController {

    @Resource
    ReportedInfoService reportedInfoService;

    @Resource
    UsertoaccidentService usertoaccidentService;


    @RequestMapping("/addReportedInfo")
    public String addReportedInfo(@RequestBody ReportedInfo reportedInfo){
        int count = reportedInfoService.addReportedInfo(reportedInfo);
        return  count>0?"添加成功":"添加失败";
    }

    @RequestMapping("/getAll")
    public List<ReportedInfo> getAll(){
        return  reportedInfoService.selectAll();
    }


    @RequestMapping("/updateByid")
    public int updateReportedInfo(int reported_number, int case_state){
        return reportedInfoService.updateReportedInfo(reported_number,case_state);
    }

    @RequestMapping("/updateBydisposestate")
    public int updateReportedInfoDispose(int reported_number, int dispose_state){
        return reportedInfoService.updateReportedInfoDispose(reported_number,dispose_state);
    }
    @RequestMapping("/getIsDispatching")
    public List<ReportedInfo> selectByDispatchingAll(){
        return reportedInfoService.selectByDispatchingAll();
    }

    @RequestMapping("/addpaigon")
    public int addPaigon(int userid, int reported_number){
        return usertoaccidentService.addPaigon(userid,reported_number);
    }
    @RequestMapping("/updatepaigon")
    public int updatePaigon(int reported_number){
        return reportedInfoService.updatePaigon(reported_number);
    }


}
