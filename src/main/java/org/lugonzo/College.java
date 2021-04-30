package org.lugonzo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*
* If we are using the @Value, @Autowired before the properties
* we do not have to put setter methods
* */

@Component("collegeBean")
public class College {

    /*@Value("Selenium Express")*/
    @Value("${collage.Name}")
    private String collegeName;

    private Principal principal;
  //we use qualifier when we have multiple interfaces connected so it chooses which one to use
    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

/*    @Autowired
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }*/

    public Principal getPrincipal() {
        return principal;
    }

    //setter injection
    @Autowired
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public College() {
    }

    //constructor injection
    public College(Principal principal) {
        this.principal = principal;
    }

 public void test(){
      principal.principalInfo();
      teacher.teach();
      System.out.println("Testing collage class");
     System.out.println("The name of the collage is :"+this.collegeName);
 }

}
