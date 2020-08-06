package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2020-08-05.
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
