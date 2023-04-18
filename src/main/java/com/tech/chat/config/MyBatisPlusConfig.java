package com.tech.chat.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: JasonD
 * @date: 2023/4/5 14:06
 * @Description:
 */
@MapperScan("com.tech.chat.mapper")
@EnableTransactionManagement
@Configuration
public class MyBatisPlusConfig {
    //配置逻辑删除组件
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
