package com.you.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author youwei
 * @version 1.0
 * @date 2023/6/7 15:41
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
