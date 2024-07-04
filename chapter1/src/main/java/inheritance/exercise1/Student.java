package chapter1.src.main.java.inheritance.exercise1;

public class Student extends Person {
    public int studentID;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public void displayStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}
