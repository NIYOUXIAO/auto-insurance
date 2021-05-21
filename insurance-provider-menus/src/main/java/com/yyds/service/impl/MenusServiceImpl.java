package com.yyds.service.impl;

import com.yyds.entity.Menus;
import com.yyds.dao.MenusDao;
import com.yyds.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Menus)表服务实现类
 *
 * @author makejava
 * @since 2021-05-21 10:37:47
 */
@Service("menusService")
public class MenusServiceImpl implements MenusService {

    @Autowired
    MenusDao menusDao;
    @Override
    public List<Menus> selectMenusById(int uid) {
        List<Menus> menus = menusDao.selectMenusById(uid);
        for (Menus menu:menus) {
            menu.setMenus(menusDao.selectMenusByfid(menu.getMid()));
        }
        return menus;
    }
}
