package com.qxy.zuul.constants;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 5:25 PM
 * @Version: 1.0
 */
public class ZuulContants {

    /**
     * 在其他阶段发生错误时执行该过滤器
     */
    public static final String ERROR_TYPE = "error";

    /**
     * 这种过滤器在路由到微服务以后执行
     */
    public static final String POST_TYPE = "post";

    /**
     * 这种过滤器在请求被路由之前调用
     */
    public static final String PRE_TYPE = "pre";

    /**
     * 这种过滤器将请求路由到微服务
     */
    public static final String ROUTE_TYPE = "route";

}
