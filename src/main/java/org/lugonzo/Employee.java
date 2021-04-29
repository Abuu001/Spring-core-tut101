package org.lugonzo;

public class Employee {

    int eid;
    String eName;
    int eSalary;
    Address address;

    public Employee() {
    }

    //constructor injection
    public Employee(Address address) {
        this.address = address;
    }

    public Employee(int eid, String eName, int eSalary) {
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

    public Address getAddress() {
        return address;
    }

    //setter injection
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                ", address=" + address +
                '}';
    }

    public void myInit(){
        System.out.println("----Object initialized----");
    }

    public void myDestroy(){
        System.out.println("----Object destroyed----");
    }
}
