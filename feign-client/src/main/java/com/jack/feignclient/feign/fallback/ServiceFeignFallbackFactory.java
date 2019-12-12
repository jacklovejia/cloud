package com.jack.feignclient.feign.fallback;

import com.jack.feignclient.feign.ServiceFeign;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceFeignFallbackFactory implements FallbackFactory<ServiceFeign> {

    @Override
    public ServiceFeign create(Throwable throwable) {

        log.info("fallback 原因:"+throwable.getMessage());
        return new ServiceFeign(){

            @Override
            public String test01(String name) {
                return "降级返回";
            }
        };
    }
}
