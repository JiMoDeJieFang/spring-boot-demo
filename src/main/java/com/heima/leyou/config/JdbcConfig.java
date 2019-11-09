package com.heima.leyou.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
//@PropertySource("classpath:application.properties")
public class JdbcConfig {
    /*@Value("${jdbc.driverClass}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;*/

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        /*dataSource.setDriverClassName(prop.getDriverClass());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());*/
        return dataSource;
    }
}
