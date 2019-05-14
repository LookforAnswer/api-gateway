package com.qxy.zuul.biz.impl;

import com.qxy.zuul.biz.ZuulRefresher;
import com.qxy.zuul.domain.IRouterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.RoutesRefreshedEvent;
import org.springframework.cloud.netflix.zuul.filters.CompositeRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 5:20 PM
 * @Version: 1.0
 */
@Service("zuulRefresher")
public class ZuulRefresherImpl implements ZuulRefresher {

    private static final Logger log = LoggerFactory.getLogger(ZuulRefresher.class);

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    @Resource
    private IRouterService iRouterService;

    @Resource
    private ServerProperties serverProperties;

    @Resource
    private ZuulProperties zuulProperties;
    @Resource
    private CompositeRouteLocator compositeRouteLocator;

    @Override
    public void refreshRoutes() {

        zuulProperties.setRoutes(iRouterService.initRoutersFromDB());

        List<RouteLocator> routeLocators = new ArrayList<>();
        RouteLocator simpleRouteLocator = new SimpleRouteLocator(serverProperties.getServletPrefix(), zuulProperties);
        routeLocators.add(simpleRouteLocator);

        compositeRouteLocator = new CompositeRouteLocator(routeLocators);
        RoutesRefreshedEvent routesRefreshedEvent = new RoutesRefreshedEvent(compositeRouteLocator);
        applicationEventPublisher.publishEvent(routesRefreshedEvent);
        log.info("zuul 路由已刷新");
    }
}
