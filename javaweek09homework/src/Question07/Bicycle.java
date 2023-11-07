package Question07;

public class Bicycle extends Vehicle{

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

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Bicycle speed increased by 5 miles");
    }


}
