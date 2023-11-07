package Question10;

public class SavingsAccount extends BankAccount {
    int withdrawalLimit;
    public SavingsAccount(int basicBalance, int withdrawalLimit){
        super(basicBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(int amount) {
        if(amount <=withdrawalLimit) {
            super.withdraw(amount);
        }else {
            System.out.println("Not enough funds to withdraw");
        }
    }
}
