package Question11;

public class ChildPerson extends Person{

   // Write a Java program to create a class called Person with private instance variables
    // name, age. and country. Provide public getter and setter methods
    // to access and modify  these variables.


    public static void main(String[] args) {
        ChildPerson ind = new ChildPerson();

        ind.setName("Alfa");
        ind.setAge(32);
        ind.setCountry("India");
        System.out.println(ind.getName());
        System.out.println(ind.getAge());
        System.out.println(ind.getCountry());
        System.out.println("---------------");

        ind.setName("Bravo");
        ind.setAge(25);
        ind.setCountry("Bhutan");
        System.out.println(ind.getName());
        System.out.println(ind.getAge());
        System.out.println(ind.getCountry());
        System.out.println("---------------");

        ind.setName("Charlie");
        ind.setAge(42);
        ind.setCountry("UK");
        System.out.println(ind.getName());
        System.out.println(ind.getAge());
        System.out.println(ind.getCountry());


    }


}
