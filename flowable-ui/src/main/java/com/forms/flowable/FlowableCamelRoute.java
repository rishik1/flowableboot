package com.forms.flowable;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FlowableCamelRoute extends RouteBuilder {

    @Override
    public void configure() {
        // Define the 'direct:flowableCamelTask' Camel endpoint referenced in BPMN
        from("direct:flowableCamelTask")
                .log("Camel received a message: ${body}") // Log the incoming message
                .setBody(simple("Hello from Camel Endpoint!")) // Modify the message body
                .log("Camel processed message to: ${body}"); // Log the modified message
    }
}