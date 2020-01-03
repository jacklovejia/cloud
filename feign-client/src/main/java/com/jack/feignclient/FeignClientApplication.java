package com.jack.feignclient;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient // 基于spring-cloud-netflix。如果是 eureke 用这一个就行了, 如果是其他注册中心可以用下面那个 @EnableDiscoveryClient
@EnableDiscoveryClient
// spring cloud中discovery service有许多种实现（eureka、consul、zookeeper等等）@EnableDiscoveryClient基于spring-cloud-commons
@EnableFeignClients
//开启hystrix
@EnableHystrix
public class FeignClientApplication {

    /**
     * 全局 feign 客户端调用日志 级别
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }


}
