package com.restApi.springRestAPI.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping("/greeting")
    public List<Greeting> getAllGreetings()  {
        return service.getGreetings();
    }
    @PostMapping("/greeting/{name}")
    public void addGreetingFromName(@PathVariable(value = "name") String name) {
        service.addGreeting(name);
    }
    @PostMapping("/greeting")
    public void addGreeting(@RequestBody Greeting newGreeting) {
        service.addGreeting(newGreeting);
    }
}
