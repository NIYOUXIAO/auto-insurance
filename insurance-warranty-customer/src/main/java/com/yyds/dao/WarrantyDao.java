package com.yyds.dao;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Warranty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WarrantyDao {

    /*
     *查询保单信息
     */
    List<Warranty> selectwarranty();

    /*
     *  根据用户提供的保单号查询保单信息
     */
    Warranty selectByWarrantyNumber(@Param("warrantyNumber") String warrantyNumber);
}

