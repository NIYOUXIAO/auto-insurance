package com.yyds.entity;

import lombok.Data;

import java.util.Date;

/**
 * (ReportedInfo)实体类
 *
 * @author makejava
 * @since 2021-05-25 10:17:36
 */
@Data
public class ReportedInfo {

    private Integer reportedNumber;

    private Date reportedTime;

    private Date caseTime;

    private Date dangerTime;

    private String narrowlyLocation;

    private String city;

    private String county;

    private String road;

    private String dangerAreaType;

    private String dangerPass;

    private String dangerCause;

    private String informants;

    private String driver;

    private String driverMob;

    private Date endTime;

    private Integer caseState;

    private String warrantyNumber;


}
