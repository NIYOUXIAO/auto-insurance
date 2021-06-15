package com.yyds.dao;

import com.yyds.entity.WarrantyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (WarrantyInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-27 08:56:33
 */
@Mapper
public interface WarrantyInfoDao {

   WarrantyInfo queryById(@Param("warrantyNumber") String warrantyNumber);

}

