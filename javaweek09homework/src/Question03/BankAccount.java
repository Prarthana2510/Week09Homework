package Question03;

public class BankAccount {

    //Write a Java program to create a class known as "BankAccount" with methods called
    //deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
    //withdraw() method to prevent withdrawals if the account balance falls below one
    //hundred.
int balance;

public void bankAccount(){
    balance = 0;
}
public void deposit(int amount){
    balance += amount;
    System.out.println("Diposited: " + amount);
}
public void withdrawal(int amount){
    if (balance >= amount){
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }else {
        System.out.println("Insufficient balance");
    }
}

}