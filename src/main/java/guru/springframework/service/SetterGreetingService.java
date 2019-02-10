package guru.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String SETTER_GREETING = "Setter Greeting Service";



    @Override
    public String sayGreeting() {
        return SETTER_GREETING;
    }
}
