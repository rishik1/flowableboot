package com.example.flowable;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;


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
        // Start both the Simple Process and Camel Process for demonstration
        startSimpleTaskProcess();
        startCamelTaskProcess();
    }

    private void startSimpleTaskProcess() {
        System.out.println("Starting Flowable Simple Task Process...");
        Map<String, Object> variables = new HashMap<>();
        variables.put("taskUser", "John Doe"); // Example variable

        try {
            ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("simpleProcess", variables);
            System.out.println("Simple Process started with ID: " + processInstance.getId());
        } catch (Exception e) {
            System.err.println("Error starting Simple Process: " + e.getMessage());
        }
    }

    private void startCamelTaskProcess() {
        System.out.println("Starting Flowable Camel Process...");
        Map<String, Object> variables = new HashMap<>();
        variables.put("inputVar", "Hello from Flowable"); // Example input variable for Camel

        try {
            ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("CamelProcess", variables);
            System.out.println("Camel Process started with ID: " + processInstance.getId());
        } catch (Exception e) {
            System.err.println("Error starting Camel Process: " + e.getMessage());
        }
    }
}
//
//@SpringBootApplication
//public class FlowableApplication implements CommandLineRunner {
//
//    private final RuntimeService runtimeService;
//
//    public FlowableApplication(RuntimeService runtimeService) {
//        this.runtimeService = runtimeService;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(FlowableApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) {
//        // Start "CamelProcess" and trigger Camel Task in the flow
//        System.out.println("Starting Flowable Camel Process...");
//
//        Map<String, Object> variables = new HashMap<>();
//        variables.put("inputVar", "Hello from Flowable");
//
//        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("CamelProcess", variables);
//        System.out.println("Camel Process started with ID: " + processInstance.getId());
//    }
//}