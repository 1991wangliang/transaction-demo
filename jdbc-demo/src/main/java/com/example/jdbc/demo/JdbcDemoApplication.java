package com.example.jdbc.demo;

import com.example.common.demo.CommonTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CommonTest.class)
public class JdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcDemoApplication.class,args);
    }

}
