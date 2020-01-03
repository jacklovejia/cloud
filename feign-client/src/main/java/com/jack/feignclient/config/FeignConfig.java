package com.jack.feignclient.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Retryer feignRetryer() {
//        return new Retryer.Default();
        return Retryer.NEVER_RETRY;
    }
}
