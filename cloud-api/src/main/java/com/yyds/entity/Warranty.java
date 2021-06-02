package com.yyds.entity;


import lombok.Data;
import java.util.Date;

@Data
public class Warranty {
    private String warrantyNumber;   /*保单编号*/
    private Integer recognizee;      /*被保人编号-外键*/
    private Date permissionDate;     /*签单日期*/
    private Date insuranceBeginDate; /*保险起期*/
    private Date insuranceEndDate;/*保险止期*/
    private Date paymentDate; /*缴费时间*/
    private Integer premiumTotal;/*保费总额*/
    private Integer warrantyType;/*保单类型-外键*/
    private Integer warrantyState; /*保单状态-外键*/
    private Integer coverAgeNumber;/*险种编号*/
    private String coverAgeName;/*险种名称*/
    private Integer premiumSum;/*保费金额*/
    private Integer indemnifyMax;/*赔偿限额*/
    private Integer engineNumber;/*发动机号*/
    private String frameNumber;/*车架号*/
    private String makeNumber;/*厂牌型号*/
    private String licenseNumber;/*号牌号码*/
    private String carColor;/*车身颜色*/
    private Integer motorType;/*机动车类型-外键*/
    private Date mintedDate;/*出厂日期*/
    private Integer customersSum;/*核定载客数*/
    private String sailNumber;/*车辆行驶证号*/
    private String carOwner_name;/*车主姓名*/
    private Integer vpDollar;/*新车购记日期*置价*/
    private Integer placemanLength; /*实际使用年限*/
    private Integer mileage;/*已行驶里程*/
}
