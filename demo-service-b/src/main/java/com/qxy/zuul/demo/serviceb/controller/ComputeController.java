package com.qxy.zuul.demo.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 3:14 PM
 * @Version: 1.0
 */
@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient client;


    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(Integer a, Integer b)
    {
        System.out.println("host:"+client.getLocalServiceInstance().getHost()+"   -----port:"+client.getLocalServiceInstance().getPort());
        return a+b+" ------      host:"+client.getLocalServiceInstance().getHost()+"   -----port:"+client.getLocalServiceInstance().getPort();
    }
}
