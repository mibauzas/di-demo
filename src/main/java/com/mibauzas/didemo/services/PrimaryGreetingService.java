package com.mibauzas.didemo.services;

/**
 * Created by mbs on 01/23/20
 */
public class PrimaryGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;
    

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

}