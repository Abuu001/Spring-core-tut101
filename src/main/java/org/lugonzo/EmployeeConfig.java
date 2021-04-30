package org.lugonzo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public  Address empAddress(){
        Address addr = new Address();
        addr.setCity("Nairobi");
        addr.setState("Kenya");
        addr.setZipCode(78238913);
        return addr;
    }

    @Bean
    public Employee employee101(){
        Employee emp =new Employee();
        emp.seteName("Brenda");
        emp.setEid(103);
        emp.seteSalary(89_000);
        emp.setAddress(empAddress());

        return emp;
    }
}
