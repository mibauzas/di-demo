package com.mibauzas.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
/**
 * Created by mbs on 01/24/20
 */
@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Primärer Grussdienst";
    }

}