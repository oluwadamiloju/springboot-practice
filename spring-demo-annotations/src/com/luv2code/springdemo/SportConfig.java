package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
    //define bean for fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for coach implementation and inject fortune service bean in it
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
