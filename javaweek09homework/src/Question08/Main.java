package Question08;

public class Main {

    //Write a Java program to create a class Employee with a method called  calculateSalary().
    // Create two subclasses Manager and Programmer. In each subclass,
    // override the calculateSalary() method to calculate
    // and return the salary based on their  specific roles.
    public static void main(String[] args) {
        Employee manager = new Manager("Martin", 70000);
        Employee programmer = new Programmer("Lewis", 45000);
        System.out.println(manager.getName() + " is a " + manager.getJobRole() + ": His salary is: " + manager.calculateSalary());
        System.out.println(programmer.getName() + " is a " + programmer.getJobRole() + ": His salary is: " + programmer.calculateSalary());

    }
}
