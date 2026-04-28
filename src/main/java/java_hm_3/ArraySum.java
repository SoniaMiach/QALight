package java_hm_3;

public class ArraySum {
    public static void main(String[] args) {

        // Arrays.Task 1. Find the sum of all elements in the array.
        int [] numbers = {-10, 22, 32, 34, 63, 2};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of the elements: " + sum);
    }
}
