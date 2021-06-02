package com.yyds.service;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Warranty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@CrossOrigin(origins = "http://localhost:8888")
@FeignClient(value = "cloud-provider-user3",path = "/warrantys")
public interface WarrantyClientService {

    @RequestMapping("/selectwarranty")
    List<Warranty> selectwarranty();
}
