package com.yyds.service;

import com.yyds.entity.Menus;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Menus)表服务接口
 *
 * @author makejava
 * @since 2021-05-21 10:37:47
 */
public interface MenusService {

    List <Menus> selectMenusById(int uid);

}
