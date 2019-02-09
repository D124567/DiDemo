package guru.springframework.controllers;

import guru.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class PropertyInjectedController {


    @Autowired
    public  GreetingServiceImpl greetingService;


    public String sayGreeting(){

        return greetingService.sayGreeting();
    }


}