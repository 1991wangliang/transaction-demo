package com.example.atomikos.demo.dao;

import com.example.atomikos.demo.po.JpaDemo;
import com.example.common.demo.dao.BaseDao;
import com.example.common.demo.entity.Demo;
import com.example.atomikos.demo.test01.mappers.Usermapper01;
import com.example.atomikos.demo.test02.mappers.Usermapper02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoDao implements BaseDao{

    @Autowired
    private Usermapper01 usermapper01;

    @Autowired
    private Usermapper02 usermapper02;

    @Override
    public int save(Demo demo) {
        JpaDemo jpaDemo = new JpaDemo();
        jpaDemo.setId(demo.getId());
        jpaDemo.setName(demo.getName());
        int res1 = usermapper01.save(jpaDemo).getId();
        int res2 = usermapper02.save(jpaDemo).getId();
        return res1+res2;
    }




}
