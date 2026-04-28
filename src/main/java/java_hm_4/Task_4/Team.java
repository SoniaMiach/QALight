package java_hm_4.Task_4;

import java_hm_4.Task_1.Student;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }
}
