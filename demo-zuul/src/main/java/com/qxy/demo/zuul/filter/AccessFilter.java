package com.qxy.demo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 过滤器相关只是参考：http://blog.didispace.com/spring-cloud-source-zuul/
 *
 * @Description: 过滤器
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 3:59 PM
 * @Version: 1.0
 */
public class AccessFilter extends ZuulFilter {

    public static final Logger log = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * pre：可以在请求被路由之前调用
     * routing：在路由请求时候被调用
     * post：在routing和error过滤器之后被调用
     * error：处理请求时发生错误时被调用
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 通过int值来定义过滤器的执行顺序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关。
     * 在下例中，我们直接返回true，所以该过滤器总是生效。
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器具体逻辑
     *
     * @return
     */
    @Override
    public Object run() {


        RequestContext ctx = RequestContext.getCurrentContext();

        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            log.warn("access token is empty");

            //令zuul过滤该请求，不对其进行路由
            ctx.setSendZuulResponse(false);

            //设置了其返回的错误码
            ctx.setResponseStatusCode(401);

            //ctx.setResponseBody(body) 通过此方式设置返回信息

            return null;
        }
        log.info("access token ok");
        return null;
    }
}
