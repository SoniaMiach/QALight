package java_hm_3;

import java.util.Scanner;

public class DayOfWeek {
    // Methods. Task 2
    public static String getDay(int number) {

        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "It's better to be Friday today..";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numb (1-7):");
        int number = scanner.nextInt();
        System.out.println(getDay(number));
        scanner.close();
    }
}
