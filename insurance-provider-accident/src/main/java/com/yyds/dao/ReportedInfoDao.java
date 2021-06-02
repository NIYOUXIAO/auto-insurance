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

    int addReportedInfo(ReportedInfo reportedInfo);
}

