package com.jack.feignclient.controller;

import com.jack.feignclient.feign.ServiceFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {
    @Autowired
    private ServiceFeign serviceFeign;

    @GetMapping("/hi")
    public String test01(@RequestParam String name) {
        log.info("收到hi 请求, 准备调用微服务");
        return serviceFeign.test01(name);
    }
}
