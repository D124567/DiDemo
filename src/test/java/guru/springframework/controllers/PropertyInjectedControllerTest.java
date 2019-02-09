package guru.springframework.controllers;

import guru.springframework.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;


    @Before
    public void setup(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testSayGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayGreeting() );
    }
}