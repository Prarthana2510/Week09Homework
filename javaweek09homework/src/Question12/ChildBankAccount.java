package Question12;

public class ChildBankAccount extends BankAccount {

    //Write a Java program to create a class called BankAccount with private instance
    // variables accountNumber and balance. Provide public getter and setter methods to
    // access and modify these variables.
    public static void main(String[] args) {
        ChildBankAccount m = new ChildBankAccount();
        m.setAccountNumber(12378912);
        m.setBalance(500);
        System.out.println(m.getAccountNumber());
        System.out.println(m.getBalance());
        System.out.println("----------------");

        m.setAccountNumber(52645656);
        m.setBalance(3500);
        System.out.println(m.getAccountNumber());
        System.out.println(m.getBalance());
        System.out.println("----------------");

        m.setAccountNumber(47894026);
        m.setBalance(5000);
        System.out.println(m.getAccountNumber());
        System.out.println(m.getBalance());



    }

}
