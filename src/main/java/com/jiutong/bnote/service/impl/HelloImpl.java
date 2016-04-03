package com.jiutong.bnote.service.impl;

import com.jiutong.bnote.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by  on 16/4/2.
 */
@Service("hello")
public class HelloImpl implements Hello {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public HelloImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void say() {

        System.out.print("hello");

    }

    @Override
    public List<Map<String, Object>> query() {
        return  jdbcTemplate.queryForList("SELECT * FROM t_user");
    }


}
