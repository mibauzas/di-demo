package com.mibauzas.didemo.services;

/**
 * Created by mbs on 01/24/20
 */
public class PrimaryGermanGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    
    @Override
    public String sayGreeting() {
        return "Primärer Grussdienst";
    }

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

}