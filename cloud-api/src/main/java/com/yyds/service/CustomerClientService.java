package com.yyds.service;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@CrossOrigin(origins = "http://localhost:8888")
@FeignClient(value = "cloud-provider-user2",path = "/customer1")
public interface CustomerClientService {

    @RequestMapping("/selectcustomer")
    List<Policyholders> selectcustomer();

    @RequestMapping("/selectcustomername")
    List<Policyholders> selectcustomername(@RequestParam("policyholdersName") String policyholdersName,@RequestParam("credenId") String credenId);

    @RequestMapping("/selectrecognizee")
    List<Recognizee> selectRecognizee();

    @RequestMapping("/selectrecognizeename")
    List<Recognizee> selectrecognizeename(@RequestParam("recognizeeName") String recognizeeName,@RequestParam("credentialsId") String credentialsId);

    @RequestMapping("/addcustomer")
    int addPolicyholders(Policyholders policyholders);

    @RequestMapping("/addrecognizee")
    int addRecognizee(Recognizee recognizee);

    @RequestMapping("/updatecustomer")
    int updatePolicyholders(Policyholders policyholders);

    @RequestMapping("/updaterecognizee")
    int updateRecognizee(Recognizee recognizee);

    @RequestMapping("/deletecustomer")
    int detelePolicyholders(@RequestParam("policyholdersId") int policyholdersId);

    @RequestMapping("/deleterecognizee")
    int deteleRecognizee(@RequestParam("recognizeeId") int recognizeeId);
}
