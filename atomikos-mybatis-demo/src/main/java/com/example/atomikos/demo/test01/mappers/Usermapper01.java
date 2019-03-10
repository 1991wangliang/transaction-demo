package com.example.atomikos.demo.test01.mappers;

import com.example.common.demo.entity.Demo;
import org.apache.ibatis.annotations.Insert;

public interface Usermapper01 {

    @Insert("INSERT INTO t_demo(name) VALUES(#{name})")
    int save(Demo demo);
}
