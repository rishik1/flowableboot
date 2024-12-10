//package com.example.flowable.camel;
//
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class CamelConfiguration extends RouteBuilder {
//
//    @Override
//    public void configure() throws Exception {
//        from("flowable:CamelProcess:camelTask") // Executes when a Flowable CamelTask is reached
//                .log("Processing Camel Task for process instance [${header.processInstanceId}]")
//                .setBody(constant("Camel Task Executed Successfully!"))
//                .log("Camel Task response: ${body}");
//    }
//}