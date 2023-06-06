package com.you.vueblog.service.impl;

import com.you.vueblog.entity.User;
import com.you.vueblog.mapper.UserMapper;
import com.you.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
