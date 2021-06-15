package com.yyds.entity;

import lombok.Data;

@Data
public class warrantytype {
    private Integer coverAgeNumber;   /*险种编号*/
    private String warrantyNumber;   /*保单编号*/
    private String coverAgename;   /*险种名称*/
    private Integer premiumSum;   /*保费金额*/
    private Integer indemnifyMax;   /*赔偿限额*/
}
