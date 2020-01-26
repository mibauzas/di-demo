package com.mibauzas.didemo.config;

import com.mibauzas.didemo.services.GreetingRepository;
import com.mibauzas.didemo.services.GreetingService;
import com.mibauzas.didemo.services.GreetingServiceFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * GreetingServiceConfig
 */
@Configuration 
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Profile({"en","default"})
    @Primary
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.creatGreetingService("en");
    }

    @Bean
    @Profile("de")
    @Primary
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.creatGreetingService("de");
    }

    @Bean
    @Profile("es")
    @Primary
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.creatGreetingService("es");
    }

    
}