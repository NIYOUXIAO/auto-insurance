package com.yyds.dao;

import com.yyds.entity.Menus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Menus)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-21 10:37:47
 */
@Mapper
public interface MenusDao {

    //根据用户编号查询用户所有的菜单权限
   List <Menus> selectMenusById(@Param("uid") int uid);

   //根据父id查询父菜单跟所父菜单下的子菜单
    List <Menus> selectMenusByfid(@Param("fid") int fid);

}

