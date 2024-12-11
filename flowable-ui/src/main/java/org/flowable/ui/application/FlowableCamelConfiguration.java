//package org.flowable.ui.application;
//
//import org.apache.camel.CamelContext;
//import org.flowable.camel.impl.CamelBehaviorDefaultImpl;
//import org.flowable.camel.impl.CamelServiceTaskBehaviorFactory;
//import org.flowable.engine.impl.bpmn.parser.factory.DefaultActivityBehaviorFactory;
//import org.flowable.spring.SpringProcessEngineConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class FlowableCamelConfiguration {
//
//    @Bean
//    public CamelBehaviorDefaultImpl camelBehavior(CamelContext camelContext) {
//        CamelBehaviorDefaultImpl camelBehavior = new CamelBehaviorDefaultImpl();
//        camelBehavior.setCamelContext(camelContext); // Use the Camel Context provided by Spring
//        return camelBehavior;
//    }
//
//    @Bean
//    public CamelServiceTaskBehaviorFactory camelBehaviorFactory(CamelBehaviorDefaultImpl camelBehavior) {
//        CamelServiceTaskBehaviorFactory behaviorFactory = new CamelServiceTaskBehaviorFactory();
//        behaviorFactory.setCamelBehavior(camelBehavior); // Link the Camel Behavior
//        return behaviorFactory;
//    }
//
//    @Bean
//    public SpringProcessEngineConfiguration processEngineConfiguration(
//            SpringProcessEngineConfiguration configuration,
//            CamelServiceTaskBehaviorFactory camelBehaviorFactory) {
//        // Set the custom activity behavior factory
//        configuration.setActivityBehaviorFactory(camelBehaviorFactory);
//        return configuration;
//    }
//}
//}