package com.example.mybatis.demo.dao;

import com.example.common.demo.dao.BaseDao;
import com.example.common.demo.entity.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoDao extends BaseDao {

    @Insert("insert into t_demo(name) values(#{name})")
    int save(Demo demo);
}
