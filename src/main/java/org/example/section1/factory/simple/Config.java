package org.example.section1.factory.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String hello() {
        return "hello";
    }
}
