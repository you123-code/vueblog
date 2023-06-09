package com.you.vueblog.controller;


import com.you.vueblog.common.Result;
import com.you.vueblog.entity.User;
import com.you.vueblog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author youwei
 * @since 2023-06-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        return Result.succ(userService.getById(1));
    }


    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user){
        if(userService.save(user)){
            return Result.succ(null);
        }
            return Result.fail("添加失败");
    }
}
