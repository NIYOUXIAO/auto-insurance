package com.yyds.controller;
import com.yyds.entity.ReportedInfo;
import com.yyds.service.ReportedInfoClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @RequestMapping("/getAll")
    public List<ReportedInfo> getAll(){
        return   reportedInfoClientService.getAll();
    }


    @RequestMapping("/updateByid/{reported_number}/{case_state}")
    public int updateReportedInfo(@PathVariable  int reported_number,@PathVariable int case_state){
        return   reportedInfoClientService.updateReportedInfo(reported_number,case_state);
    }

    @RequestMapping("/updateBydisposestate/{reported_number}/{dispose_state}")
    public int updateReportedInfoDispose(@PathVariable  int reported_number,@PathVariable int dispose_state){
        return   reportedInfoClientService.updateReportedInfoDispose(reported_number,dispose_state);
    }

    @RequestMapping("/getIsDispatching")
    public List<ReportedInfo> selectByDispatchingAll(){
        return   reportedInfoClientService.selectByDispatchingAll();
    }

    @RequestMapping("/addpaigon")
    public int addPaigon( int userid, int reported_number){
        return reportedInfoClientService.addPaigon(userid,reported_number);
    }

    @RequestMapping("/updatepaigon")
    public int updatePaigon(int reported_number){
        return reportedInfoClientService.updatePaigon(reported_number);
    }
}
