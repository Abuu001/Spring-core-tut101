package org.lugonzo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Employee e =new Employee();
        e.setEid(101);
        e.seteName("mose");
        e.seteSalary(200_000);

        System.out.println(e);

        System.out.println("------------------Spring IoC in Action--------------------------");
        //Inversion of control (IOC)
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");
        Employee e1 =(Employee)context.getBean("emp1");
        Employee e2 =context.getBean("emp2",Employee.class);

        System.out.println(e1);
        System.out.println(e2);

        //spring way IOC
        ApplicationContext context2 = new ClassPathXmlApplicationContext("studentBean.xml");
        Student stud1=(Student)context2.getBean("stud1");
        System.out.println(stud1);

        //============customer============
        System.out.println("------------------Customer--------------------------");
        ApplicationContext context3= new ClassPathXmlApplicationContext("customer.xml");
        CustomerService cust =(CustomerService)context3.getBean("cust1");
        cust.printName();
        cust.printUrl();

        ApplicationContext context5= new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee emp2 =(Employee)context5.getBean("employee101");
        System.out.println(emp2);

        System.out.println("------------------Annotations--------------------------");
      /*  ApplicationContext context4= new ClassPathXmlApplicationContext("collegeBean.xml");*/
        ApplicationContext context4= new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college= context4.getBean("collegeBean",College.class);
        System.out.println("Object is " +college);
        college.test();
        ((AnnotationConfigApplicationContext)context4).close();

        AnnotationConfigApplicationContext context6= new AnnotationConfigApplicationContext(LearnerConfig.class);
        Learner lear = (Learner)context6.getBean("learnerBean");
        lear.displayLearnerInfo();
        context6.close();
    }
}
