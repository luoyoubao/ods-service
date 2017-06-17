package com.xunmeng.ods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan({ "com.xunmeng.application", "com.xunmeng.ods.*" })
@SpringBootApplication
// @EnableZuulProxy
public class MainAppliction {

    public static void main(String[] args) {
        SpringApplication.run(MainAppliction.class, args);
    }
}
