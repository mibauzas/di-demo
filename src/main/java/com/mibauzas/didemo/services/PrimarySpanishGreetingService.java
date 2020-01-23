package com.mibauzas.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
/**
 * Created by mbs on 01/23/20
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Servicio de saludo primario";
    }

}