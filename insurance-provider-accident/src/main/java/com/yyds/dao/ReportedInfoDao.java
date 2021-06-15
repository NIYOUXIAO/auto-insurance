package com.yyds.dao;

import com.yyds.entity.ReportedInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ReportedInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-25 10:17:36
 */
@Mapper
public interface ReportedInfoDao {

    //查询所有
    List<ReportedInfo> selectAll();

    //增加出险信息
    int addReportedInfo(ReportedInfo reportedInfo);

    //修改报案处理
    int updateReportedInfo(@Param("reported_number") int reported_number,@Param("case_state") int case_state);

    //修改案件状态
    int updateReportedInfoDispose(@Param("reported_number") int reported_number,@Param("dispose_state") int dispose_state);

    //查询符合派工单的信息
    List<ReportedInfo> selectByDispatchingAll();

    //修改为已派工
    int updatePaigon(@Param("reported_number") int reported_number);

}

