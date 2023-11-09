package Question07;

public class Main {
    //Write a Java program to create a class Vehicle with a method called speedUp().
    // Create  two subclasses Car and Bicycle.
    // Override the speedUp() method in each subclass to  increase the vehicle's speed differently.
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle();
        System.out.println("Car's speed before speeding up: " + c.getSpeed());
        c.speedUp();
        System.out.println("Car's speed after speeding up: " + c.getSpeed());
        System.out.println("___________________");

        System.out.println("Bicycle's speed before speeding up: " + b.getSpeed());
        b.speedUp();
        System.out.println("Bicycle's speed after speeding up: " + b.getSpeed());

    }
}
