package com.yyds.entity;

import lombok.Data;

import java.util.List;

/**
 * (Menus)实体类
 *
 * @author makejava
 * @since 2021-05-21 10:37:46
 */
@Data
public class Menus{
    private static final long serialVersionUID = -40133057446162943L;

    private Integer mid;

    private String mname;

    private String murl;

    private String mexplain;

    private Integer fid;

    private List<Menus> menus;

}
