package java_hm_5.Task_2;

public class Program {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 5);
        Truck truck = new Truck("Volvo", 80, 10.5);

        car.move();
        car.stop();

        truck.move();
        truck.stop();
    }
}
