package com.yyds.service;

import com.yyds.entity.ReportedInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ReportedInfo)表服务接口
 *
 * @author makejava
 * @since 2021-05-25 10:17:36
 */
public interface ReportedInfoService {

    List<ReportedInfo> selectAll();

    int addReportedInfo(ReportedInfo reportedInfo);

    int updateReportedInfo(int reported_number,int case_state);

    int updateReportedInfoDispose(@Param("reported_number") int reported_number, @Param("dispose_state") int dispose_state);

    List<ReportedInfo> selectByDispatchingAll();

    int updatePaigon(int reported_number);

}
