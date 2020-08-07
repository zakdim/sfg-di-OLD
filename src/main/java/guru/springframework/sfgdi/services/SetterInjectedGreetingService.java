package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by dmitri on 2020-08-07.
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
