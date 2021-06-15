package com.yyds.dao;

import com.yyds.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Users)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-18 15:30:36
 */
@Mapper
public interface UsersDao {

    /*
     *查询用户,用户登录
     */
    Users selectUser(@Param("username") String username, @Param("userpassword") String userpassword);

    /*
     * 查询所有的用户
     */
    List<Users> selectUserAll();
}

