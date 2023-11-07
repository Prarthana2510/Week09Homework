package Question09;

public class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("Birds fly");
    }

    @Override
    public void sound() {
        System.out.println("Birds cohoo");
    }
}
