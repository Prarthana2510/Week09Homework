package Question10;

public class Main {

    //Write a Java program to create a base class BankAccount with
    // methods deposit() and  withdraw(). Create two subclasses
    // SavingsAccount and CheckingAccount. Override the  withdraw() method
    // in each subclass to impose different withdrawal limits and fees.

    public static void main(String[] args) {
        SavingsAccount sA = new SavingsAccount(500, 500);
        CheckingAccount cA = new CheckingAccount(1000, 10000 );

        System.out.println("Savings Account Balance: " + sA.getBalance());
        sA.deposit(200);
        sA.withdraw(300);

        System.out.println("Checking Account Balance: " + cA.getBalance());
        cA.deposit(200);
        cA.withdraw(300);

    }
}
