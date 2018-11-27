package com.zcy.hello.demo.dobbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class HelloDemoDobboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDemoDobboConsumerApplication.class, args);
    }
}
