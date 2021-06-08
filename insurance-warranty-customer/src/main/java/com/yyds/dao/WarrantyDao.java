package com.yyds.dao;

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
    /*
     *添加保单信息
     */
    int addWarranty(Warranty warranty);

    /*
     *修改保单信息
     */
    int updateWarranty(Warranty warranty);
}

