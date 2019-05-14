package com.qxy.zuul.mapper;

import com.qxy.zuul.biz.ZuulRefresher;
import com.qxy.zuul.SpringBaseTest;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.Resource;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 7:37 PM
 * @Version: 1.0
 */
@ActiveProfiles("dev")
public class TestMapperTest extends SpringBaseTest {

    @Resource
    private ZuulRefresher zuulRefresher;

    @Test
    public void testMapper(){
        zuulRefresher.refreshRoutes();
    }
}
