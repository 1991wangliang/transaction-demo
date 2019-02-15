package com.example.common.demo.service;

import com.example.common.demo.dao.BaseDao;
import com.example.common.demo.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoService {

    @Autowired
    private BaseDao baseDao;


    public void save(){
        Demo demo = new Demo();
        demo.setName("name");
        int res = baseDao.save(demo);
        System.out.println(res);
    }


}
