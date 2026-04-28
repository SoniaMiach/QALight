package java_hm_5.Task_1;

public class Program {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Dog dog = new Dog();

        bird.eat();
        bird.fly();

        fish.sleep();
        fish.swim();

        dog.eat();
        dog.bark();
    }
}
