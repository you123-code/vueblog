package com.you.vueblog.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author youwei
 * @version 1.0
 * @date 2023/6/6 23:30
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.gyg.mapper")
public class MybatisPlusConfig {

    /**
     * 实现一个分页插件PaginationInterceptor
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
