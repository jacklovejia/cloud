package com.jack.feignclient.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Retryer feignRetryer() {
//        return new Retryer.Default(1000, SECONDS.toMillis(100), 5);
//        return new Retryer.Default();
        return Retryer.NEVER_RETRY;
    }
}
