package Question10;

public class BankAccount {

    //Write a Java program to create a base class BankAccount with
    // methods deposit() and  withdraw(). Create two subclasses
    // SavingsAccount and CheckingAccount. Override the  withdraw() method
    // in each subclass to impose different withdrawal limits and fees.
    int balance;

    public BankAccount(int basicBalance) {
        balance = basicBalance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("You Have Deposited: " + amount);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You Have Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }

    public int getBalance() {
        return balance;
    }
}
