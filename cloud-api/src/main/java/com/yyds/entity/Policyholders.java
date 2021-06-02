package com.yyds.entity;

import lombok.Data;

@Data
public class Policyholders {
    private Integer policyholdersId;  //投保人编号

    private String policyholdersName; //投保人姓名

    private String sex;   //性别

    private Integer credentialsType;  //证件类型

    private String credenId;    //证件号码

    private String telephone;   //联系电话

    private String address;   //联系地址
}
