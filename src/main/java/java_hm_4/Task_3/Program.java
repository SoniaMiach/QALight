package java_hm_4.Task_3;

public class Program {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(1),
                new Circle(2),
                new Circle(3)
        };

        for (Circle circle : circles) {
            System.out.println("Area: " + circle.getArea());
            System.out.println("Length: " + circle.getCircumference());
        }
    }
}
