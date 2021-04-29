package org.lugonzo;

public class Employee {

    int eid;
    String eName;
    int eSalary;

    public Employee() {
    }

    public Employee(int eid,String eName,int eSalary) {
        this.eid = eid;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", eSalary='" + eSalary + '\'' +
                '}';
    }


}
