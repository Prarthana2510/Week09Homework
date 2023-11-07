package Question09;

public class Panther extends Animal {
    public static void main(String[] args) {
        Bird b = new Bird();
        Panther p = new Panther();
        b.move();
        b.sound();
        p.move();
        p.sound();
    }

    @Override
    public void move() {
        System.out.println("Panthers run");
    }

    @Override
    public void sound() {
        System.out.println("Panthers roar");
    }
}
