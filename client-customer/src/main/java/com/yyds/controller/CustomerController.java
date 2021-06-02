package com.yyds.controller;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.service.CustomerClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8888")
@RequestMapping("/getCostomer")
public class CustomerController {
    @Autowired
    CustomerClientService customerClientService;

    @RequestMapping("/selectAll1")
    public List<Policyholders> selectcustomer(){
        return customerClientService.selectcustomer();
    }

    @RequestMapping("/selectname1")
    public List<Policyholders> selectcustomername(String policyholdersName ,String  credenId){
        return customerClientService.selectcustomername(policyholdersName,credenId);
    }

    @RequestMapping("/selectAll2")
    public List<Recognizee> selectRecognizee(){
        return customerClientService.selectRecognizee();
    }

    @RequestMapping("/selectname2")
    public List<Recognizee> selectrecognizeename(@PathVariable String recognizeeName , @PathVariable String  credentialsId){
        return customerClientService.selectrecognizeename(recognizeeName,credentialsId);
    }

    @PostMapping (value="/addCust")
    public int addPolicyholders(Policyholders policyholders){
        return customerClientService.addPolicyholders(policyholders);
    }

    @PostMapping (value="/addReco")
    public int addRecognizee(Recognizee recognizee){
        return customerClientService.addRecognizee(recognizee);
    }

    @PostMapping (value="/updateCust")
    public int updatecustomer(Policyholders policyholders){
        return customerClientService.updatePolicyholders(policyholders);
    }

    @PostMapping (value="/updaterecognizee")
    public int updateRecognizee(Recognizee recognizee){
        return customerClientService.updateRecognizee(recognizee);
    }

    @RequestMapping ("/deleteCust/{policyholdersId}")
    public int detelePolicyholders(@PathVariable int policyholdersId){
        return customerClientService.detelePolicyholders(policyholdersId);
    }

    @RequestMapping ("/deleteReco/{recognizeeId}")
    public int deteleRecognizee(@PathVariable int recognizeeId){
        return customerClientService.deteleRecognizee(recognizeeId);
    }
}