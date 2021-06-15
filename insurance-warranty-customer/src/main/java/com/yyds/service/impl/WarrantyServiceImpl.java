package com.yyds.service.impl;

import com.yyds.dao.WarrantyDao;
import com.yyds.entity.Policyholders;
import com.yyds.entity.Recognizee;
import com.yyds.entity.Warranty;
import com.yyds.entity.warrantytype;
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
<<<<<<< HEAD
    public List<Warranty> selectwarrantyone(int recognizee) {
        return warrantyDao.selectwarrantyone(recognizee);
    }

    @Override
=======
    public Warranty selectByWarrantyNumber(String warrantyNumber) {
        return warrantyDao.selectByWarrantyNumber(warrantyNumber);
    }

>>>>>>> origin/master
    public int addWarranty(Warranty warranty) {
        return warrantyDao.addWarranty(warranty);
    }

    @Override
    public List<warrantytype> selectwarrantytype(String warrantyNumber) {
        return warrantyDao.selectwarrantytype(warrantyNumber);
    }

    @Override
    public int addWarrantytype(warrantytype warrantytype) {
        return warrantyDao.addWarrantytype(warrantytype);
    }

    @Override
    public int updateWarranty(Warranty warranty) {
        return warrantyDao.updateWarranty(warranty);
    }

    @Override
    public List<Recognizee> selectRecognizee() {
        return warrantyDao.selectRecognizee();
    }

    @Override
    public int updateWarrantyxu(Warranty warranty) {
        return warrantyDao.updateWarrantyxu(warranty);
    }
}
