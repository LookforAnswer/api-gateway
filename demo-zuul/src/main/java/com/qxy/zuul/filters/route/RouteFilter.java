package com.qxy.zuul.filters.route;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import com.qxy.zuul.constants.ZuulContants;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 5:29 PM
 * @Version: 1.0
 */
public class RouteFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return ZuulContants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
