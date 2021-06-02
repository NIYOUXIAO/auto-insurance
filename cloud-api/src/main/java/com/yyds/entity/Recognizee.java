package com.yyds.entity;

import lombok.Data;

@Data
public class Recognizee {
    private Integer recognizeeId;   /*被保人编号*/
    private String recognizeeName; /*被保人姓名*/
    private String policyholdersName; /*投保人姓名*/
    private String sex; /*性别*/
    private Integer credentialsType; /*证件类型(1.身份证 2.军官证 3.)*/
    private String credentialsId;   /*证件号码*/
    private String telephone; /*联系电话*/
    private String address;  /*联系地址*/
    private String bank; /*银行名称*/
    private Integer bankAccount;   /*银行账户*/
    private String driverId; /*驾驶证号码*/
}
