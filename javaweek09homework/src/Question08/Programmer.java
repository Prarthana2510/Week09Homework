package Question08;

public class Programmer extends Employee {
    int salary;

    public static void main(String[] args) {
        Employee manager = new Manager("Martin", 70000);
        Employee programmer = new Programmer("Lewis", 45000);
        System.out.println(manager.getName() + " is a " + manager.getJobRole() + ": His salary is: " + manager.calculateSalary());
        System.out.println(programmer.getName() + " is a " + programmer.getJobRole() + ": His salary is: " + programmer.calculateSalary());

    }

    public Programmer(String name, int salary) {
        super(name, "Programmer");
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return salary;
    }
}
