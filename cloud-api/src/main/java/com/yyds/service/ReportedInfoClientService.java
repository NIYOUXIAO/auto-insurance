package com.yyds.service;

import com.yyds.entity.ReportedInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Component
@FeignClient(value = "cloud-provider-accident",path = "/accident")

public interface ReportedInfoClientService {

    @RequestMapping("/addReportedInfo")
    public String addReportedInfo(ReportedInfo reportedInfo);

    @RequestMapping("/getAll")
    public List<ReportedInfo> getAll();

    @RequestMapping("/updateByid")
    public int updateReportedInfo(@RequestParam("reported_number") int reported_number,@RequestParam("case_state") int case_state);

    @RequestMapping("/updateBydisposestate")
    public int updateReportedInfoDispose(@RequestParam("reported_number") int reported_number,@RequestParam("dispose_state") int dispose_state);

    @RequestMapping("/getIsDispatching")
    public List<ReportedInfo> selectByDispatchingAll();

    @RequestMapping("/addpaigon")
    public int addPaigon(@RequestParam("userid") int userid,@RequestParam("reported_number") int reported_number);

    @RequestMapping("/updatepaigon")
    public int updatePaigon(@RequestParam("reported_number") int reported_number);
}
