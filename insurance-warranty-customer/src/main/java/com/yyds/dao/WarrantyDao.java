package com.yyds.dao;

import com.yyds.entity.Recognizee;
import com.yyds.entity.Warranty;
import com.yyds.entity.warrantytype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WarrantyDao {

    /*
     *查询被投保人
     */
    List<Recognizee> selectRecognizee();

    /*
     *查询险种信息
     */
    List<warrantytype> selectwarrantytype(@Param("warrantyNumber") String warrantyNumber);

    /*
     *查询保单信息
     */
    List<Warranty> selectwarranty();

    /*
     *查询保单信息
     */
    List<Warranty> selectwarrantyone(@Param("recognizee") int recognizee);

    /*
     *添加保单信息
     */
    int addWarranty(Warranty warranty);

    /*
     *添加险种信息
     */
    int addWarrantytype(warrantytype warrantytype);

    /*
     *修改保单信息
     */
    int updateWarranty(Warranty warranty);

    /*
     *续保
     */
    int updateWarrantyxu(Warranty warranty);
}
