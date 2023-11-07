package question05;

public class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public int calculateMaximumSpeed() {
        return 120;  // Maximum speed for a car is 120
    }

    @Override
    public double calculateDistanceTraveled() {
        return 50.0;  // Distance traveled for a car is 50
    }

    @Override
    public double calculateFuelEfficiency() {
        double fuelEfficiency = calculateMaximumSpeed()/calculateDistanceTraveled();
        return fuelEfficiency;
    }
}
