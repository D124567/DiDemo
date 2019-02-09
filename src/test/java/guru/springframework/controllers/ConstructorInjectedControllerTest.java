package guru.springframework.controllers;

import guru.springframework.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup() throws Exception {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayGreetings() {
        assertEquals(GreetingServiceImpl.GREETING, constructorInjectedController.sayGreetings());
    }
}