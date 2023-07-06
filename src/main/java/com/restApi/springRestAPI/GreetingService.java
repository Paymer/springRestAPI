package com.restApi.springRestAPI;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private List<Greeting> greetings = new ArrayList<>();

    public List<Greeting> getGreetings(){
        return this.greetings;
    }

    public void addGreeting(String name){
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        greetings.add(greeting);
    }

    public void addGreeting(Greeting greeting){
        greetings.add(greeting);
    }
}
