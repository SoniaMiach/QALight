package java_hm_2;

public class ScoreEvaluator {
    public static void main(String[] args) {
        // If-else task 4. Grading on a point scale
        int score = -9;

        if (score >= 90 && score <= 100) {
            System.out.println("A+");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 50) {
            System.out.println("C");
        } else if (score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Incorrect value");
        }
    }
}
