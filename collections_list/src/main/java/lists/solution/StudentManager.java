package collections_list.src.main.java.lists.solution;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                break;
            }
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
    }

    public void findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
                break;
            }
        }
    }
}
