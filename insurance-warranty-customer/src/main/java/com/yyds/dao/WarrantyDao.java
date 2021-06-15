package com.yyds.dao;

<<<<<<< HEAD
import com.yyds.entity.Recognizee;
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
     *查询保单信息
     */
    List<Warranty> selectwarrantyone(@Param("recognizee") int recognizee);

=======
     *  根据用户提供的保单号查询保单信息
     */
    Warranty selectByWarrantyNumber(@Param("warrantyNumber") String warrantyNumber);
>>>>>>> origin/master
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

