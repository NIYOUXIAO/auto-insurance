package com.yyds.service;

import com.yyds.entity.Warranty;

import java.util.List;

public interface WarrantyService {

    /*
     *查询保单信息
     */
    List<Warranty> selectwarranty();
}
