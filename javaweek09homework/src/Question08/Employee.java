package Question08;

public class Employee {

    //Write a Java program to create a class Employee with a method called  calculateSalary().
    // Create two subclasses Manager and Programmer. In each subclass,
    // override the calculateSalary() method to calculate
    // and return the salary based on their  specific roles.

    String name;
    String jobRole;

    public Employee(String name, String jobRole) {
        this.name = name;
        this.jobRole = jobRole;
    }

    public String getName() {
        return name;
    }

    public String getJobRole() {
        return jobRole;
    }

    public int calculateSalary() {
        return 0;
    }

}
