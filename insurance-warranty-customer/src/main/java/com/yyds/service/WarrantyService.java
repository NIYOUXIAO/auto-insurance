package com.yyds.service;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Warranty;

import java.util.List;

public interface WarrantyService {

    /*
     *查询保单信息
     */
    List<Warranty> selectwarranty();

    /*
     *添加投保人信息
     */
    int addWarranty(Warranty warranty);

    /*
     *修改保单信息
     */
    int updateWarranty(Warranty warranty);
}
