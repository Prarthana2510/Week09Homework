package question05;

public class Vehicle {

    //Write a Java program to create a vehicle class hierarchy. The base class should be
    //Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    //properties such as make, model, year, and fuel type. Implement methods for
    //calculating fuel efficiency, distance traveled, and maximum speed.

    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation logic here
        double fuelEfficiency = calculateMaximumSpeed()/calculateDistanceTraveled();
        return 0.0;
    }

    public double calculateDistanceTraveled() {
        // Implement distance traveled calculation logic here
        return 0.0;
    }

    public int calculateMaximumSpeed() {
        // Implement maximum speed calculation logic here
        return 0;
    }
}
