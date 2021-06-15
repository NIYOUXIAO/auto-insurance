package com.yyds.service;

import com.yyds.entity.Usertoaccident;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Usertoaccident)表服务接口
 *
 * @author makejava
 * @since 2021-06-05 08:32:07
 */
public interface UsertoaccidentService {

    int addPaigon(int userid, int reported_number);

}
