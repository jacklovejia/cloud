package com.jack.feignclient.feign.fallback;

import com.jack.feignclient.feign.ServiceFeign;
import org.springframework.stereotype.Component;

@Component
public class ServiceFeignFallback implements ServiceFeign {
    @Override
    public String test01(String name) {
        return "异常了 我擦" + name;
    }
}
