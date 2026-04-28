package java_hm_3;

import java.util.Scanner;

public class TriangleChecker {
    //Methods. Task 1.
    public static boolean canFormTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (canFormTriangle(a, b, c)) {
            System.out.println("You can construct a triangle");
        } else {
            System.out.println("It is impossible to construct a triangle");
        }
        scanner.close();
    }
}
