package com.zcy.hello.demo.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@EnableHystrix

@SpringBootApplication
public class HelloDemoDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDemoDubboProviderApplication.class, args);
    }
}
