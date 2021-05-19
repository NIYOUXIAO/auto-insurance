package com.yyds.entity;

import lombok.Data;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2021-05-18 15:30:35
 */
@Data
public class Users {
    private static final long serialVersionUID = 710306263297470528L;

    private Integer userid;

    private String username;

    private String userpassword;

}
