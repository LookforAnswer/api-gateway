package com.qxy.zuul.sync;

import com.qxy.zuul.biz.ZuulRefresher;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 9:01 PM
 * @Version: 1.0
 */
@Component
public class SyncService implements InitializingBean {

    @Resource
    private ZuulRefresher zuulRefresher;

    @Override
    public void afterPropertiesSet() throws Exception {
        zuulRefresher.refreshRoutes();
    }

}
