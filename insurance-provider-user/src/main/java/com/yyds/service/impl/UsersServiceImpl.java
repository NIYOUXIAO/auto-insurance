package com.yyds.service.impl;

import com.yyds.entity.Users;
import com.yyds.dao.UsersDao;
import com.yyds.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2021-05-18 15:30:36
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    UsersDao usersDao;


    //查询用户,用户登录
    @Override
    public Users selectUser(String username,String userpassword) {
        return usersDao.selectUser(username,userpassword);
    }

    @Override
    public List<Users> selectUserAll() {
        return usersDao.selectUserAll();
    }
}
