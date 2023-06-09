package com.you.vueblog.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author youwei
 * @version 1.0
 * @date 2023/6/7 21:01
 */
@Data
public class LoginDTO implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
