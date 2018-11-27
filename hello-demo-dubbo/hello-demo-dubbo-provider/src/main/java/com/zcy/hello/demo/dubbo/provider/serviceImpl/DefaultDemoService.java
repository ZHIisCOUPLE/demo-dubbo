package com.zcy.hello.demo.dubbo.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zcy.hello.demo.dubbo.api.service.DemoService;
import org.springframework.beans.factory.annotation.Value;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @HystrixCommand
    public String sayHello(String name) {
//        return "Hello, " + name + " (from Spring Boot)"+"----------------"+port;
        throw new RuntimeException("Exception to show hystrix enabled.");
    }
}
