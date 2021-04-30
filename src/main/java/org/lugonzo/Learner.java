package org.lugonzo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("learnerBean")
public class Learner {

    @Value("${learner.name}")
    private String name;

    @Value("${learner.interestedCourse}")
    private  String interestedCourse;
    private String hobby;

    @Value("${learner.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayLearnerInfo(){
        System.out.println("Student name : "+name);
        System.out.println("Student courses Enrolled :" + interestedCourse);
        System.out.println("Student hobby : " +hobby);
    }
}
