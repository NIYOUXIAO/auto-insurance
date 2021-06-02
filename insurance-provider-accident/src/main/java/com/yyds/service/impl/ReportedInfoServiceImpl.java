package com.yyds.service.impl;

import com.yyds.entity.ReportedInfo;
import com.yyds.dao.ReportedInfoDao;
import com.yyds.service.ReportedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    @Override
    public int addReportedInfo(ReportedInfo reportedInfo) {

        return reportedInfoDao.addReportedInfo(reportedInfo);
    }
}
