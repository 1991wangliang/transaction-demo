package com.example.xa.demo;

import com.example.xa.demo.test.XADemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class XADemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XADemoApplication.class,args);
    }

    @Autowired
    private XADemo xaDemo;

    @PostConstruct
    public void test(){
        xaDemo.test();
    }
}
