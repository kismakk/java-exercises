package chapter1.src.main.java.inheritance.exercise2;

import chapter1.src.main.java.inheritance.exercise1.Student;

public class GraduateStudent extends Student {
    public String thesisTitle;
    public int graduationYear;

    public GraduateStudent(String name, int age, int studentID, String thesisTitle, int graduationYear) {
        super(name, age, studentID);
        this.thesisTitle = thesisTitle;
        this.graduationYear = graduationYear;
    }

    public void displayGraduateStudentInfo() {
        displayStudentInfo();
        System.out.println("Thesis Title: " + thesisTitle);
        System.out.println("Graduation Year: " + graduationYear);
    }
}
