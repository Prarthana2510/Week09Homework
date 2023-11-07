package Question06;

public class Cat extends Animal{

    public static void main(String[] args) {
        Bird b = new Bird();
        Cat c = new Cat();
        b.sound();
        c.sound();

    }
    @Override
    public void sound() {
        System.out.println("Cats say meow");
    }


}
