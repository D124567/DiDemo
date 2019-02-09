package guru.springframework.controllers;

import guru.springframework.service.GreetingServiceImpl;
import org.springframework.stereotype.Service;


class PropertyInjectedController {


    public  GreetingServiceImpl greetingService;


    public String sayGreeting(){

        return greetingService.sayGreeting();
    }


}