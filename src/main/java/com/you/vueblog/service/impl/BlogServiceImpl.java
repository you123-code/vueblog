package com.you.vueblog.service.impl;

import com.you.vueblog.entity.Blog;
import com.you.vueblog.mapper.BlogMapper;
import com.you.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
