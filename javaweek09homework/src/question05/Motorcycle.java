package question05;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public int calculateMaximumSpeed() {
        return 140;  // Maximum speed for a motorcycle is 140
    }

    @Override
    public double calculateDistanceTraveled() {
        return 60.0;  // Distance traveled for a motorcycle is 60
    }

    @Override
    public double calculateFuelEfficiency() {
        double fuelEfficiency = calculateMaximumSpeed() / calculateDistanceTraveled();
        return fuelEfficiency;
    }

    /*public static void main(String[] args) {
        Truck truck = new Truck("Ford", "Transit", 2019, "Diesel");
        Car car = new Car("Mercedez-Benz", "Smart", 2004, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2023, "Gasoline");

        System.out.println("Truck maximum speed: " + truck.calculateMaximumSpeed());
        System.out.println("Truck distance traveled: " + truck.calculateDistanceTraveled());
        System.out.println("Truck Average is: " + truck.calculateFuelEfficiency());

        System.out.println("Car maximum speed: " + car.calculateMaximumSpeed());
        System.out.println("Car distance traveled: " + car.calculateDistanceTraveled());
        System.out.println("Car Average is: " + car.calculateFuelEfficiency());

        System.out.println("Motorcycle maximum speed: " + motorcycle.calculateMaximumSpeed());
        System.out.println("Motorcycle distance traveled: " + motorcycle.calculateDistanceTraveled());
        System.out.println("Mototcycle Average is: " + motorcycle.calculateFuelEfficiency());
        //System.out.println(truck.calculateFuelEfficiency());
        //System.out.println(car.calculateFuelEfficiency());
        //System.out.println(motorcycle.calculateFuelEfficiency());
    }*/
}
