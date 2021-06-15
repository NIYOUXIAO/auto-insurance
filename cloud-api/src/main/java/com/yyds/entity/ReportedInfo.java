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


    private Integer reported_number;

    private Date reported_time;

    private Date case_time;

    private Date danger_time;

    private String narrowly_location;

    private String city;

    private String county;

    private String road;

    private String danger_area_type;

    private String danger_pass;

    private String danger_cause;

    private String informants;

    private String driver;

    private String driver_mob;

    private Date end_time;

    private Integer case_state;

    private String warranty_number;

    private WarrantyInfo warrantyInfo;

    private int dispose_state;

    private int dispatching_state;


}
