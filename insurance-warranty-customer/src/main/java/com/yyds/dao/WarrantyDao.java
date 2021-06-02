package com.yyds.dao;

import com.yyds.entity.Policyholders;
import com.yyds.entity.Warranty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarrantyDao {

    /*
     *查询保单信息
     */
    List<Warranty> selectwarranty();
}
