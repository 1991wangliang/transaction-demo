package com.example.atomikos.demo.test02.mappers;

import com.example.common.demo.entity.Demo;
import org.apache.ibatis.annotations.Insert;

public interface Usermapper02 {

    @Insert("INSERT INTO t_demo(name) VALUES(#{name})")
    int save(Demo demo);
}
