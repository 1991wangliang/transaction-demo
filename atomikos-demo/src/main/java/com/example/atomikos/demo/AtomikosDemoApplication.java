package com.example.atomikos.demo;

import com.example.atomikos.demo.config.DBConfig1;
import com.example.atomikos.demo.config.DBConfig2;
import com.example.common.demo.CommonTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
@SpringBootApplication
@Import(CommonTest.class)
public class AtomikosDemoApplication {

    public static void main( String[] args ) {
        SpringApplication.run(AtomikosDemoApplication.class, args);
    }

}
