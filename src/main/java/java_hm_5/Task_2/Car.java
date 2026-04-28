package java_hm_5.Task_2;

public class Car extends Vehicle{
    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Transport " + name + " are going with "
                + speed + " km with " + passengerCapacity + "quantity of peoples");
    }
}
