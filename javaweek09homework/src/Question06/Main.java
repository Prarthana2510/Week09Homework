package Question06;

public class Main {
    //Write a Java program to create a base class Animal (Animal Family) with a method
    // called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
    // each subclass to make a specific sound for each animal.
    public static void main(String[] args) {
        Bird b = new Bird();
        Cat c = new Cat();
        b.sound();
        c.sound();

    }
}
