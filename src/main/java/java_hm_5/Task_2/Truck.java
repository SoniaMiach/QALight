package java_hm_5.Task_2;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Transport " + name + " by load capacity "
                + loadCapacity + " is moving at a speed of " + speed + " km");
    }

}
