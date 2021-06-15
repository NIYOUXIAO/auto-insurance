package com.yyds.service.impl;

import com.yyds.dao.WarrantyInfoDao;
import com.yyds.entity.ReportedInfo;
import com.yyds.dao.ReportedInfoDao;
import com.yyds.entity.WarrantyInfo;
import com.yyds.service.ReportedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (ReportedInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-05-25 10:17:37
 */
@Service("reportedInfoService")
public class ReportedInfoServiceImpl implements ReportedInfoService {

    @Resource
    ReportedInfoDao reportedInfoDao;

    @Resource
    WarrantyInfoDao warrantyInfoDao;

    List<ReportedInfo> reportedInfoList = new ArrayList<ReportedInfo>();
    @Override
    public List<ReportedInfo> selectAll() {
        reportedInfoList.clear();
        List<ReportedInfo> list = reportedInfoDao.selectAll();
        for (ReportedInfo reportedInfo:list) {
            if(warrantyInfoDao.queryById(reportedInfo.getWarranty_number())!=null){
                reportedInfo.setWarrantyInfo(warrantyInfoDao.queryById(reportedInfo.getWarranty_number()));
                reportedInfoList.add(reportedInfo);
            }
        }
        return reportedInfoList;
    }

    @Override
    public int addReportedInfo(ReportedInfo reportedInfo) {

        return reportedInfoDao.addReportedInfo(reportedInfo);
    }

    @Override
    public int updateReportedInfo(int reported_number, int case_state) {
        return reportedInfoDao.updateReportedInfo(reported_number,case_state);
    }

    @Override
    public int updateReportedInfoDispose(int reported_number, int dispose_state) {

        return reportedInfoDao.updateReportedInfoDispose(reported_number,dispose_state);
    }

    @Override
    public List<ReportedInfo> selectByDispatchingAll() {
        reportedInfoList.clear();
        List<ReportedInfo> list = reportedInfoDao.selectByDispatchingAll();
        for (ReportedInfo reportedInfo:list) {
            if(warrantyInfoDao.queryById(reportedInfo.getWarranty_number())!=null){
                reportedInfo.setWarrantyInfo(warrantyInfoDao.queryById(reportedInfo.getWarranty_number()));
                reportedInfoList.add(reportedInfo);
            }
        }
        return reportedInfoList;
    }

    @Override
    public int updatePaigon(int reported_number) {
        return reportedInfoDao.updatePaigon(reported_number);
    }
}
