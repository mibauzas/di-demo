package com.mibauzas.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
/**
 * Created by mbs on 01/23/20
 */
@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }

}