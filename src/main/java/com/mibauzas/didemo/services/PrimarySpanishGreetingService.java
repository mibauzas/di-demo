package com.mibauzas.didemo.services;

/**
 * Created by mbs on 01/23/20
 */
public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return "Servicio de saludo primario";
    }

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

}