package java_hm_3;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        //Arrays.Task 5.Count how many times a given number appears in the array
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        System.out.println("Enter the number:");

        int target = scanner.nextInt();
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("Number " + target + " meets " + count + " times");
        scanner.close();
    }
}
