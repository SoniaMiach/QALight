package java_hm_5.Task_2;

public class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("The vehicle is traveling at a speed of " + speed + " km");
    }

    public void stop() {
        System.out.println("Transport " + name + " is stopped");
    }
}
