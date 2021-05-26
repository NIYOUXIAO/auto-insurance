package com.yyds.service;

import com.yyds.entity.ReportedInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-provider-accident",path = "/accident")

public interface ReportedInfoClientService {

    @RequestMapping("/addReportedInfo")
    public String addReportedInfo(ReportedInfo reportedInfo);
}
