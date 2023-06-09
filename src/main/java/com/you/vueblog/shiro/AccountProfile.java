package com.you.vueblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author youwei
 * @version 1.0
 * @date 2023/6/7 17:13
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;
}
