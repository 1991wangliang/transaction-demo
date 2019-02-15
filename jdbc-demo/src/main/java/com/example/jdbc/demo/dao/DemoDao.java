package com.example.jdbc.demo.dao;

import com.example.common.demo.dao.BaseDao;
import com.example.common.demo.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DemoDao implements BaseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Demo demo){
        String sql = "insert into t_demo(name) values(?)";
        return jdbcTemplate.update(sql,demo.getName());
    }

}
