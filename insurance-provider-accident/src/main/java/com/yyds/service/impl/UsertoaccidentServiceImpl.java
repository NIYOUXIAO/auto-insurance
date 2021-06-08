package com.yyds.service.impl;

import com.yyds.entity.Usertoaccident;
import com.yyds.dao.UsertoaccidentDao;
import com.yyds.service.UsertoaccidentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Usertoaccident)表服务实现类
 *
 * @author makejava
 * @since 2021-06-05 08:32:07
 */
@Service("usertoaccidentService")
public class UsertoaccidentServiceImpl implements UsertoaccidentService {
    @Resource
    UsertoaccidentDao usertoaccidentDao;

    @Override
    public int addPaigon(int userid, int reported_number) {
        return usertoaccidentDao.addPaigon(userid,reported_number);
    }
}
