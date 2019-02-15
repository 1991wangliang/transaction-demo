package com.example.common.demo;

import com.example.common.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan
public class CommonTest {

    @Autowired
    private DemoService demoService;

    @PostConstruct
    public void test(){
        demoService.save();
    }
    
}
