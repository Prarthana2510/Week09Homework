package Question14;

public class ChildCar extends Car {

    // Write a Java program to create a class called Car with private instance variables
    // company_name, model_name, year, and mileage. Provide public getter and setter
    // methods to access and modify the company_name, model_name, and year variables.
    // However, only provide a getter method for the mileage variable.
    public static void main(String[] args) {
        ChildCar cc = new ChildCar();

        cc.setCompany_name("Mercedez Benz");
        cc.setModel_name("A Class");
        cc.setYear(2004);

        System.out.println(cc.getCompany_name());
        System.out.println(cc.getModel_name());
        System.out.println(cc.getYear());
        System.out.println(cc.getMileage());

    }


}
