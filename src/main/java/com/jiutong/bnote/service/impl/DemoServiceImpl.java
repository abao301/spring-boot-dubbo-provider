package com.jiutong.bnote.service.impl;

import com.jiutong.bnote.service.DemoService;

/**
 * Created by  on 16/4/3.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("/************paramer:"+name+"*******************/");
        return "hello dubbo "+name;
    }
}
