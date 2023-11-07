package Question03;

public class SavingsAccount extends BankAccount {

    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        account.deposit(200);
        account.withdrawal(50);
        account.deposit(200);
        account.withdrawal(100);
        account.withdrawal(200);

    }
    @Override
    public void withdrawal(int amount) {
        if (balance - amount > 100) {
            super.withdrawal(amount);
        } else {
            System.out.println("Minimum balance 100 required");
        }
    }


}
