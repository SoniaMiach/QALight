package java_hm_4.Task_4;

import java_hm_4.Task_1.Student;

public class Program {
    public static void main(String[] args) {
        Team team = new Team();

        team.addStudent(new Student("Ivan", "Petrenco", 20));
        team.addStudent(new Student("Olena", "Koval", 21));

        team.printStudents();
    }
}
