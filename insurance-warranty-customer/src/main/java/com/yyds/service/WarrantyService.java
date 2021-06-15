package com.yyds.service;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.entity.Warranty;
import com.yyds.entity.warrantytype;

import java.util.List;

public interface WarrantyService {

    /*
     *查询保单信息
     */
    List<Warranty> selectwarranty();

    /*
     *查询保单信息
     */
    List<Warranty> selectwarrantyone(int recognizee);

    /*
     *添加保单信息
     */
    int addWarranty(Warranty warranty);

    /*
     *查询险种信息
     */
    List<warrantytype> selectwarrantytype(String warrantyNumber);

    /*
     *添加险种信息
     */
    int addWarrantytype(warrantytype warrantytype);

    /*
     *修改保单信息
     */
    int updateWarranty(Warranty warranty);

    /*
     *查询被投保人
     */
    List<Recognizee> selectRecognizee();

    /*
     *续保
     */
    int updateWarrantyxu(Warranty warranty);
}
