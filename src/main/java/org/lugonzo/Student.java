package org.lugonzo;


//our class is defined as Bean or POJO (plain old java object)
public class Student {
    int studentId;
    String studentName;
    char studentGenger;

    public Student() {
    }

    public Student(int studentId, String studentName, char studentGenger) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGenger = studentGenger;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Character getStudentGenger() {
        return studentGenger;
    }

    public void setStudentGenger(char studentGenger) {
        this.studentGenger = studentGenger;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentGenger=" + studentGenger +
                '}';
    }
}
