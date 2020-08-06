package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by dmitri on 2020-08-06.
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
