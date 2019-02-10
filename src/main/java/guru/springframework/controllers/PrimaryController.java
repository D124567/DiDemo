package guru.springframework.controllers;

import guru.springframework.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
