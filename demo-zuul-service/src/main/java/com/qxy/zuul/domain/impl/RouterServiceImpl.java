package com.qxy.zuul.domain.impl;

import com.qxy.zuul.TestMapper;
import com.qxy.zuul.domain.IRouterService;
import com.qxy.zuul.domain.TestTable;
import com.qxy.zuul.domain.query.TestTableQM;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 请求数据库获取信息
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 5:37 PM
 * @Version: 1.0
 */
@Service
public class RouterServiceImpl implements IRouterService {


    @Resource
    private TestMapper testMapper;

    @Override
    public Map<String, ZuulProperties.ZuulRoute> initRoutersFromDB() {

        //TODO：从DB获取相应的
        List<TestTable> testTableList = testMapper.findList(new TestTableQM());
        if (CollectionUtils.isEmpty(testTableList)){
            return null;
        }

        Map<String, ZuulProperties.ZuulRoute> result = new HashMap<>();
        for (TestTable testTable : testTableList) {
            ZuulProperties.ZuulRoute zuulRoute = new ZuulProperties.ZuulRoute();
            zuulRoute.setPath(testTable.getPath());
            result.put("a",zuulRoute);
        }
        return result;
    }


}
