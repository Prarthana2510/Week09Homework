package Question09;

public class Main {
    //Write a Java program to create a base class Animal with methods
    // move() and  makeSound(). Create two subclasses Bird and Panthera.
    // Override the move() method  in each subclass to describe how each animal moves.
    // Also, override the makeSound()  method in each subclass to make a specific sound for each animal.
    public static void main(String[] args) {
        Bird b = new Bird();
        Panther p = new Panther();
        b.move();
        b.sound();
        p.move();
        p.sound();
    }
}
