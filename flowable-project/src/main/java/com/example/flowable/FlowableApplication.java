package com.example.flowable;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class FlowableApplication implements CommandLineRunner {

    private final RuntimeService runtimeService;

    public FlowableApplication(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(FlowableApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Starting a simple process with one task
        System.out.println("Starting Flowable process...");

        Map<String, Object> variables = new HashMap<>();
        variables.put("taskUser", "John Doe");

        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("simpleProcess", variables);
        System.out.println("Process started with ID: " + processInstance.getId());
    }
}