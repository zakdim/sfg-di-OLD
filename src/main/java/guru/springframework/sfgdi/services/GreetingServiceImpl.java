package guru.springframework.sfgdi.services;

/**
 * Created by dmitri on 2020-08-06.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
