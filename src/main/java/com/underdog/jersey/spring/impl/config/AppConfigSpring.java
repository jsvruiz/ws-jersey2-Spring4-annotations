
package com.underdog.jersey.spring.impl.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ws.header.HeaderService;

@Component
@Configuration
@ComponentScan(basePackages = {
        "com.ws.filter",
        "com.ws.service.impl",
        "com.ws.service",
        "com.ws.header",
        "com.ws.rest"
})
public class AppConfigSpring {
    
    @Configuration
    //@Profile("production")
    static class HeaderServiceConfiguration {
        
        @Bean
        public HeaderService headerService() {
            return new HeaderService();
        }
    }
    
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        return mapper;
    }

    @Bean
    public BeanPostProcessor validationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
