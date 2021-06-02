package com.yyds.dao;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerDao {

    /*
     *查询投保人
     */
    List<Policyholders> selectcustomer();

    /*
     *按条件查询
     */
    List<Policyholders> selectcustomername(@Param("policyholdersName") String policyholdersName,@Param("credenId") String credenId);
    List<Recognizee> selectrecognizeename(@Param("recognizeeName") String recognizeeName,@Param("credentialsId") String credentialsId);

    /*
     *查询被投保人
     */
    List<Recognizee> selectRecognizee();

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
    int detelePolicyholders(@Param("policyholdersId")int policyholdersId);

    /*
     *删除被投保人信息
     */
    int deteleRecognizee(@Param("recognizeeId")int recognizeeId);
}
