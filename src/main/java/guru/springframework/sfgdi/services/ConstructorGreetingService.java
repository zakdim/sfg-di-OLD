package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by dmitri on 2020-08-06.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
