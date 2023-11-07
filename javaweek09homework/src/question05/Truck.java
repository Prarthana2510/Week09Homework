package question05;

public class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public int calculateMaximumSpeed() {
        return 60;  // Maximum speed for a truck is 60
    }

    @Override
    public double calculateDistanceTraveled() {
        return 30.0;  // Distance traveled for a truck is 30
    }

    @Override
    public double calculateFuelEfficiency() {
        double fuelEfficiency = calculateMaximumSpeed() / calculateDistanceTraveled();
        return fuelEfficiency;
    }
}
