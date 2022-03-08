package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class BadmintonLoversConfig {
    //define bean for fortune service
    @Bean
    public FortuneService romanceFortune() {
        return new RomanceFortune();
    }

    //define bean for coach implementation and inject fortune service bean in it
    @Bean
    public Coach badmintonCoach() {
        return new BadmintonCoach(romanceFortune());
    }
}
