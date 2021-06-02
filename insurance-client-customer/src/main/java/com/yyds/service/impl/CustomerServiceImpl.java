package com.yyds.service.impl;

import com.yyds.dao.CustomerDao;
import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2021-05-18 15:30:36
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Resource
    CustomerDao customerDao;

    //查询投保人信息
    @Override
    public List<Policyholders> selectcustomer() {
        return customerDao.selectcustomer();
    }

    @Override
    public List<Recognizee> selectRecognizee() {
        return customerDao.selectRecognizee();
    }

    @Override
    public List<Policyholders> selectcustomername(String policyholdersName, String credenId) {
        return customerDao.selectcustomername(policyholdersName,credenId);
    }

    @Override
    public List<Recognizee> selectrecognizeename(String recognizeeName, String credentialsId) {
        return customerDao.selectrecognizeename(recognizeeName,credentialsId);
    }

    @Override
    public int addPolicyholders(Policyholders policyholders) {
        return customerDao.addPolicyholders(policyholders);
    }

    @Override
    public int addRecognizee(Recognizee recognizee) {
        return customerDao.addRecognizee(recognizee);
    }

    @Override
    public int updatePolicyholders(Policyholders policyholders) {
        return customerDao.updatePolicyholders(policyholders);
    }

    @Override
    public int updateRecognizee(Recognizee recognizee) {
        return customerDao.updateRecognizee(recognizee);
    }

    @Override
    public int detelePolicyholders(int policyholdersId) {
        return customerDao.detelePolicyholders(policyholdersId);
    }

    @Override
    public int deteleRecognizee(int recognizeeId) {
        return customerDao.deteleRecognizee(recognizeeId);
    }
}
