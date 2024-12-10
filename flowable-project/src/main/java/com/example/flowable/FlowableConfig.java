package com.example.flowable;

import org.flowable.engine.RuntimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowableConfig {

    private final RuntimeService runtimeService;

    public FlowableConfig(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Bean
    public RuntimeService runtimeServiceBean() {
        return this.runtimeService; // Returns the autowired RuntimeService
    }
}
