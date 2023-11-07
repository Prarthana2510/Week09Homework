package Question08;

public class Manager extends Employee {
    int salary;
    public Manager(String name, int salary){
        super (name, "Manager");
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return salary;
    }
}
