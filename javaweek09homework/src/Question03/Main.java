package Question03;

public class Main {
    //Write a Java program to create a class known as "BankAccount" with methods called
    //deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
    //withdraw() method to prevent withdrawals if the account balance falls below one
    //hundred.
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        account.deposit(200);
        account.withdrawal(50);
        account.deposit(200);
        account.withdrawal(100);
        account.withdrawal(200);

    }
}
