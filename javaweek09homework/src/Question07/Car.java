package Question07;

public class Car extends Vehicle{

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Car speed increased by 10 miles");
    }
}
