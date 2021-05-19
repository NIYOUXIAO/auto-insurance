package com.yyds.service;

import com.yyds.entity.Users;

import java.util.List;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2021-05-18 15:30:36
 */
public interface UsersService {

    /*
     *查询用户,用户登录
     */
    Users  selectUser(String username,String userpassword);


}
