package java_hm_2;

public class SumFrom1ToN {
    public static void main(String[] args) {
        // Loops. Task 2. The sum of the numbers from 1 to N
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("An amount ranging from 1 to " + n + " = " + sum);
    }
}
