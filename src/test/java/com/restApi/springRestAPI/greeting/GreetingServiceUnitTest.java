package com.restApi.springRestAPI.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class GreetingServiceUnitTest {

    private final static String NAME = "World";
    @Autowired private GreetingService service = new GreetingService();

    @Test
    void addGreetingTest(){
        service.addGreeting(NAME);
        List<Greeting> greetings = service.getGreetings();

        assertTrue(greetings.get(0).getContent().contains(NAME));
    }

}
