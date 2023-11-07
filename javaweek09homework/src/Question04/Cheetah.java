package Question04;

public class Cheetah extends Animal{
    public static void main(String[] args) {
        Cheetah q4 = new Cheetah();
        q4.move();

    }
    @Override
    public void move() {
        System.out.println("Cheetah is running");
    }
}
