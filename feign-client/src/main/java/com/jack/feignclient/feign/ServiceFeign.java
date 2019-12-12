package com.jack.feignclient.feign;

import com.jack.feignclient.feign.fallback.ServiceFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-feign", fallback = ServiceFeignFallback.class)
public interface ServiceFeign {
    @GetMapping(value = "/api/test01")
    String test01(@RequestParam String name);
}
