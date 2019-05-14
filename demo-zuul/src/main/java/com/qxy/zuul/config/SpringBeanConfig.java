package com.qxy.zuul.config;

import com.qxy.zuul.filters.pre.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 4:11 PM
 * @Version: 1.0
 */
@Configuration
public class SpringBeanConfig {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
