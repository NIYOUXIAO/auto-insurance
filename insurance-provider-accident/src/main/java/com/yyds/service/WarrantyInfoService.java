package com.yyds.service;

import com.yyds.entity.WarrantyInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (WarrantyInfo)表服务接口
 *
 * @author makejava
 * @since 2021-05-27 08:56:34
 */
public interface WarrantyInfoService {

    WarrantyInfo queryById(@Param("warrantyNumber") String warrantyNumber);

}
