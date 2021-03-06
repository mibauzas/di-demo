package com.mibauzas.didemo.config;

import com.mibauzas.didemo.examplebeans.FakeDatasource;
import com.mibauzas.didemo.examplebeans.FakeJmsBroker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * PropertyConfig
 */
@Configuration
public class PropertyConfig {

    @Value("${com.mibauzas.user}")
    String user;
    
    @Value("${com.mibauzas.password}")
    String password;

    @Value("${com.mibauzas.url}")
    String url;

    @Value("${com.mibauzas.jms.username}")
    String jmsUsername;

    @Value("${com.mibauzas.jms.password}")
    String jmsPassword;

    @Value("${com.mibauzas.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDatasource fakeDatasource() {
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUser(user);
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        return fakeDatasource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}