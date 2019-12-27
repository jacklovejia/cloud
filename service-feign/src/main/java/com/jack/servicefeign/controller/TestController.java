package com.jack.servicefeign.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {

    @Value("${jack}")
    private String jack;

    @GetMapping("/test01")
    public String test01(@RequestParam String name) {
        log.info("收到请求:"+name);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        int a = 10/0;
        log.info("返回:"+name+ UUID.randomUUID());
        return "你好" + name;
    }

    @PostMapping("/test02")
    public String test02(@RequestBody String name){
        log.info("收到请求");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = UUID.randomUUID()+":"+name;
        log.info("超时返回:"+ result);
        return result;
    }

    @GetMapping("/test03")
    public String test03(){
        return jack;
    }
}
