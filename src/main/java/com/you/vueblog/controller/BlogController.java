package com.you.vueblog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.you.vueblog.common.Result;
import com.you.vueblog.entity.Blog;
import com.you.vueblog.service.BlogService;
import com.you.vueblog.util.ShiroUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author youwei
 * @since 2023-06-07
 */
@Slf4j
@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blogList")
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage){
        Page page = new Page(currentPage,5);
        IPage pageData = blogService.page(page, new QueryWrapper<Blog>().orderByDesc("created"));
        return Result.succ(pageData);
    }

    @GetMapping("/details")
    public Result details(Long id){
        Blog blog = blogService.getById(id);
        Assert.notNull(blog,"该文章已被删除");
        return Result.succ(blog);
    }

    @RequiresAuthentication//认证后才能访问
    @PostMapping("/edit")
    public Result edit(@Validated @RequestBody Blog blog){
        Blog temp = null;
        if(!ObjectUtils.isEmpty(blog.getId())){
            temp = blogService.getById(blog.getId());
            log.info("blog.getUserId():"+blog.getUserId()+" ShiroUtils.getCurrentLogin().getId():"+ShiroUtils.getCurrentLogin().getId());
            Assert.isTrue(blog.getUserId()== ShiroUtils.getCurrentLogin().getId(),
                    "只能编辑自己的blog");
        }else{
            temp = new Blog();
            temp.setCreated(LocalDateTime.now());
            temp.setUserId(ShiroUtils.getCurrentLogin().getId());
            temp.setStatus(0);
        }
        BeanUtils.copyProperties(blog,temp,"created","userId","status","id");
        blogService.saveOrUpdate(temp);
        return Result.succ(null);
    }

}
