package Question10;

public class CheckingAccount extends BankAccount{
    int charges;

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

    public CheckingAccount(int basicBalance, int charges) {
        super(basicBalance);
        this.charges = charges;
    }

    @Override
    public void withdraw(int amount) {
        if(amount<=balance){
            super.withdraw(2000);
            balance -=charges;
            System.out.println("You have gone over your balance, charges will apply");
        }else {
            System.out.println("Insufficient funds to withdraw" + amount);
        }
    }
}
