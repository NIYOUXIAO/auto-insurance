package com.yyds.service;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2021-05-18 15:30:36
 */
public interface CustomerService {

    /*
     *查询投保人
     */
    List<Policyholders> selectcustomer();

    /*
     *查询被投保人
     */
    List<Recognizee> selectRecognizee();

    /*
     *按条件查询
     */
    List<Policyholders> selectcustomername(@Param("policyholdersName") String policyholdersName,@Param("credenId") String credenId);
    List<Recognizee> selectrecognizeename(@Param("recognizeeName") String recognizeeName,@Param("credentialsId") String credentialsId);

    /*
     *添加投保人信息
     */
    int addPolicyholders(Policyholders policyholders);

    /*
     *添加被投保人信息
     */
    int addRecognizee(Recognizee recognizee);

    /*
     *修改投保人信息
     */
    int updatePolicyholders(Policyholders policyholders);

    /*
     *修改被投保人信息
     */
    int updateRecognizee(Recognizee recognizee);

    /*
     *删除投保人信息
     */
    int detelePolicyholders(int policyholdersId);

    /*
     *删除投保人信息
     */
    int deteleRecognizee(@Param("recognizeeId")int recognizeeId);
}
