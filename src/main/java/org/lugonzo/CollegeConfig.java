package org.lugonzo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.lugonzo") // when using beanTag thre is no deed of declaring this line(use it when u hav e declared a component)
/*@PropertySource("classPath:collegeInfo.properties")*/
public class CollegeConfig {

    //Nb our method name is going to be our bean ID

    /*@Bean
    public Teacher teacherBean(){
        Teacher t1= new MathTeacher();
         // or return new MathTeacher();
        return t1;
    }

    @Bean
    public Principal principalBean(){
        return new Principal();
    }

    @Bean
    public College collegeBean(){
     *//*  This is using constructor injection
        College college = new College(principalBean());
      *//*

        //using setter injection
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(teacherBean());
        *//*
        * OR
        * return new College();
        * *//*
        return  college;
    }*/
}
