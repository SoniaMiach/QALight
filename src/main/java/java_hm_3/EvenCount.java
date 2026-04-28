package java_hm_3;

public class EvenCount {
    public static void main(String[] args) {
        // Arrays.Task 3.Count the number of paired elements in the array.
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int count = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of paired: " + count);
    }
}
