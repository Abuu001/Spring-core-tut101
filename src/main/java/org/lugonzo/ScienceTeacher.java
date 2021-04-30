package org.lugonzo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println(" Hi am your science teacher");
        System.out.println("My name is Mr Fredd");
    }
}
