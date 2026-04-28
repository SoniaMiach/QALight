package java_hm_3;

public class ReplaceNegatives {

    public static void main(String[] args) {
        //Arrays.Task 4.Replace all negative elements in the array with zero.
        int[] numbers = {5, -3, 8, -1, 0, -7};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("New array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
