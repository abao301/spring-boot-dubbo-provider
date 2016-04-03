package com.jiutong.bnote.service.impl;

import com.jiutong.bnote.App;
import com.jiutong.bnote.service.Hello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by  on 16/4/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class HelloImplTest {

    @Autowired
    private Hello hello;

    @Test
    public void testSay(){
        hello.say();
    }

    @Test
    public void testQuery(){
        List<Map<String, Object>> list = hello.query();
        for (Map<String,Object> map :list) {
            Set set = map.keySet();
            Iterator ite = set.iterator();
            while (ite.hasNext()){
                String key = (String) ite.next();
                Object val = (Object) map.get(key);
                System.out.println("key:"+key);
                System.out.println("val:"+val);
            }

        }
    }
}