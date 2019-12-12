package com.jack.servicefeign.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {

    @GetMapping("/test01")
    public String test01(@RequestParam String name) {
        log.info("收到请求:"+name);
        return "你好" + name;
    }
}
