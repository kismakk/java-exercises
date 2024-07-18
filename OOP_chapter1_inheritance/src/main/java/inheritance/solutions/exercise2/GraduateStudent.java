package OOP_chapter1_inheritance.src.main.java.inheritance.solutions.exercise2;

import OOP_chapter1_inheritance.src.main.java.inheritance.solutions.exercise1.Student;

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
