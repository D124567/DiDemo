package guru.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String CONSTRUCTOR_GREETING = "Constructor Greeting Service";

    @Override
    public String sayGreeting() {
        return CONSTRUCTOR_GREETING;
    }
}
