package com.yyds.controller;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer1")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/selectcustomer")
    public List<Policyholders> selectcustomer(){
         return customerService.selectcustomer();
     }

    @RequestMapping("/selectcustomername")
    public List<Policyholders> selectcustomername(String policyholdersName, String credenId){
        return customerService.selectcustomername(policyholdersName,credenId);
    }

    @RequestMapping("/selectrecognizee")
    public List<Recognizee> selectRecognizee(){
        return customerService.selectRecognizee();
    }

    @RequestMapping("/selectrecognizeename")
    public List<Recognizee> selectrecognizeename(String recognizeeName, String credentialsId){
        return customerService.selectrecognizeename(recognizeeName,credentialsId);
    }

    @PostMapping(value = "/addcustomer")
    public int addPolicyholders(@RequestBody Policyholders policyholders){
        return customerService.addPolicyholders(policyholders);
    }

    @PostMapping(value = "/addrecognizee")
    public int addRecognizee(@RequestBody Recognizee recognizee){
        return customerService.addRecognizee(recognizee);
    }

    @PostMapping(value = "/updatecustomer")
    public int updatePolicyholders(@RequestBody Policyholders policyholders){
        return customerService.updatePolicyholders(policyholders);
    }

    @PostMapping(value = "/updaterecognizee")
    public int updateRecognizee(@RequestBody Recognizee recognizee){
        return customerService.updateRecognizee(recognizee);
    }

    @RequestMapping("/deletecustomer")
    public int detelePolicyholders(int policyholdersId){
        return customerService.detelePolicyholders(policyholdersId);
    }

    @RequestMapping("/deleterecognizee")
    public int deteleRecognizee(int recognizeeId){
        return customerService.deteleRecognizee(recognizeeId);
    }
}
