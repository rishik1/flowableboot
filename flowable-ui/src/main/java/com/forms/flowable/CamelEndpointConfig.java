package com.forms.flowable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelEndpointConfig {

    @Bean
    public String myProcessTask() {
        return "direct:myProcessTask"; // You can route Flowable's service task to this endpoint
    }
}