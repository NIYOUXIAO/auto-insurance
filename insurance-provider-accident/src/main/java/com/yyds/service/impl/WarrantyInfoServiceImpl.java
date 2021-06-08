package com.yyds.service.impl;

import com.yyds.entity.WarrantyInfo;
import com.yyds.dao.WarrantyInfoDao;
import com.yyds.service.WarrantyInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WarrantyInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-05-27 08:56:34
 */
@Service("warrantyInfoService")
public class WarrantyInfoServiceImpl implements WarrantyInfoService {
    @Resource
    private WarrantyInfoDao warrantyInfoDao;


    @Override
    public WarrantyInfo queryById(String warrantyNumber) {
        return warrantyInfoDao.queryById(warrantyNumber);
    }
}
