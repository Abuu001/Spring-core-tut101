package org.lugonzo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //when we use @Primary it sets the class as a default when injected in other class
public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println(" Hi am your math teacher");
        System.out.println("My name is Sourav");
    }
}
