package com.forms.flowable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.flowable.ui.application","org.apache.camel","org.flowable.ui.application"})

@SpringBootApplication
public class flowableUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(flowableUiApplication.class, args);
    }

}
