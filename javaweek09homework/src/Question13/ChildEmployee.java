package Question13;
public class ChildEmployee extends Employee{

    //Write a Java program to create a class called Employee with private instance variables
    // employee_id, employee_name, and employee_salary. Provide public getter and setter
    // methods to access and modify the id and name variables, but provide a getter method
    // for the salary variable that returns a formatted string.

    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee();
        ChildEmployee dm = new ChildEmployee();
        dm.setEmployeeId(21);

        // Set values using setter methods
        dm.setEmployeeId(10205);
        dm.setEmployeeName("Alfa Bravo");
        dm.setEmployeeSalary(51000);

        // Get values using getter methods
        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary();


        System.out.println("ID: " + dm.getEmployeeId());

        System.out.println("Name: " + dm.getEmployeeName());

        System.out.println(dm.getFormattedSalary());

    }

}
