package question05;

public class Main {

    //Write a Java program to create a vehicle class hierarchy. The base class should be
    //Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    //properties such as make, model, year, and fuel type. Implement methods for
    //calculating fuel efficiency, distance traveled, and maximum speed.

    public static void main(String[] args) {
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
    }
}
