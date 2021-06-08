package com.yyds.service.impl;

import com.yyds.dao.WarrantyDao;
import com.yyds.entity.Policyholders;
import com.yyds.entity.Warranty;
import com.yyds.service.WarrantyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("warrantyService")
public class WarrantyServiceImpl implements WarrantyService {
    @Resource
    WarrantyDao warrantyDao;

    //查询投保人信息
    @Override
    public List<Warranty> selectwarranty() {
        return warrantyDao.selectwarranty();
    }

    @Override
    public Warranty selectByWarrantyNumber(String warrantyNumber) {
        return warrantyDao.selectByWarrantyNumber(warrantyNumber);
    }

    public int addWarranty(Warranty warranty) {
        return warrantyDao.addWarranty(warranty);
    }

    @Override
    public int updateWarranty(Warranty warranty) {
        return warrantyDao.updateWarranty(warranty);
    }
}
