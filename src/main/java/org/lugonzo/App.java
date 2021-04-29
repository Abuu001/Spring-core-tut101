package org.lugonzo;

import org.springframework.context.ApplicationContext;
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
    }
}
