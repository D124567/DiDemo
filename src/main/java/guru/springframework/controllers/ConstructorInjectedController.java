package guru.springframework.controllers;

import guru.springframework.service.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService =greetingService;


    }

    public String sayGreetings(){
        return greetingService.sayGreeting();
    }
}
