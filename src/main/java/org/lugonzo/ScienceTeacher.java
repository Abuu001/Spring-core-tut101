package org.lugonzo;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println(" Hi am your math teacher");
        System.out.println("My name is Sourav");
    }
}
