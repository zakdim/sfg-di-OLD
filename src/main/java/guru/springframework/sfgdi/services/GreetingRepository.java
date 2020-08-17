package guru.springframework.sfgdi.services;

/**
 * Created by dmitri on 2020-08-16.
 */
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
