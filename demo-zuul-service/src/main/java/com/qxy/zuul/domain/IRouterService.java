package com.qxy.zuul.domain;

import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import java.util.Map;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 5:20 PM
 * @Version: 1.0
 */
public interface IRouterService {

    Map<String, ZuulProperties.ZuulRoute> initRoutersFromDB();
}
