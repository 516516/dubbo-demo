package com.personal.knowledge.dubbo.bootdemouserprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.schema.DubboBeanDefinitionParser;
import com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class BootDemoUserProviderApplication {

    public static void main(String[] args) {
//        DubboBeanDefinitionParser
//        DubboNamespaceHandler

        SpringApplication.run(BootDemoUserProviderApplication.class, args);
    }

}
