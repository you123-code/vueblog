package com.you.vueblog.util;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.you.vueblog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author youwei
 * @version 1.0
 * @date 2023/6/7 21:55
 */
public class ShiroUtils {
    
    public static AccountProfile getCurrentLogin(){
        JSONObject jsonObject= JSONUtil.parseObj(SecurityUtils.getSubject().getPrincipal());
        return JSONUtil.toBean(jsonObject,AccountProfile.class) ;
    }
}
