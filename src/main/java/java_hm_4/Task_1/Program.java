package java_hm_4.Task_1;

public class Program {
        public static void main(String[] args) {

            Student[] students = {
                    new Student("Ivan", "Petrenco", 20),
                    new Student("Olena", "Koval", 21),
                    new Student("Marko", "Ivanov", 19),
                    new Student("Anna", "Shevchenko", 22),
                    new Student("Dmytro", "Bondar", 23)
            };

            for (Student student : students) {
                System.out.println(student.getFullName());
            }
        }
    }

