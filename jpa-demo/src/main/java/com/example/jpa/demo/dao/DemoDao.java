package com.example.jpa.demo.dao;

import com.example.common.demo.dao.BaseDao;
import com.example.common.demo.entity.Demo;
import com.example.jpa.demo.po.JpaDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoDao implements BaseDao {

    @Autowired
    private JpaDemoDao jpaDemoDao;

    @Override
    public int save(Demo demo) {
        JpaDemo req = new JpaDemo();
        req.setName(demo.getName());
        req.setId(demo.getId());
        JpaDemo res= jpaDemoDao.save(req);
        return res.getId();
    }
}
