package java_hm_3;

public class MaxElement {
    public static void main(String[] args) {
        //Arrays.Task 2.Find the largest element in an array
        int[] numbers = {10, 5, 78, 23, 1};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number is: " + max);
    }
}
