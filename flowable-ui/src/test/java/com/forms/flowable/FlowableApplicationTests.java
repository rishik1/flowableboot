package com.forms.flowable;

import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@EnableAutoConfiguration(exclude = {CamelAutoConfiguration.class}) // Use @EnableAutoConfiguration for exclusions
@SpringBootTest
public class FlowableApplicationTests {

    @Test
    void contextLoads() {
        // Test logic
    }
}