package com.zxelec.springboot_listener_filter_interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootListenerFilterInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootListenerFilterInterceptorApplication.class, args);
    }
}
