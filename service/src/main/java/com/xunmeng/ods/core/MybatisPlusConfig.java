package com.xunmeng.ods.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.xunmeng.ods.mapper*")
public class MybatisPlusConfig {

    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    // @Bean
    // public PaginationInterceptor paginationInterceptor() {
    // PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
    // paginationInterceptor.setDialectType(DBType.H2.getDb());
    // // paginationInterceptor.setOptimizeType(Optimize.JSQLPARSER.getOptimize());
    // return paginationInterceptor;
    // }
}
