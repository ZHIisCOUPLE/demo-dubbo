package com.zcy.hello.demo.dobbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zcy.hello.demo.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}")
    /**
     * ,
     *             application = "${dubbo.application.id}",
     *   指定连接到的服务提供者
     *             url = "dubbo://localhost:12345"
     */
    private DemoService demoService;

    @HystrixCommand(fallbackMethod = "erros")
    @RequestMapping("/sayHello")
    public String sayHello() {

     return demoService.sayHello("zzzzz");

    }

    public String erros(){
        return "错错错！";
    }

}