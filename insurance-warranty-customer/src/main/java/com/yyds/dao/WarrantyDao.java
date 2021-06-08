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
     *添加保单信息
     */
    int addWarranty(Warranty warranty);

    /*
     *修改保单信息
     */
    int updateWarranty(Warranty warranty);
}
