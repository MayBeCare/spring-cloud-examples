package com.client.cn.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author : asus
 * @version : 1.0
 * @Description : 实现数据源的刷新
 * @Date : 2018/5/21 15:54
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */

@RefreshScope
@Configuration// 配置数据源
public class DataSourceConfig {

    @Bean
    @RefreshScope// 刷新配置文件
    @ConfigurationProperties(prefix="spring.datasource") // 数据源的自动配置的前缀
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
