package com.yyds.dao;

import com.yyds.entity.Usertoaccident;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Usertoaccident)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-05 08:32:06
 */
@Mapper
public interface UsertoaccidentDao {

   int addPaigon(@Param("userid") int userid, @Param("reported_number")  int reported_number);

}

