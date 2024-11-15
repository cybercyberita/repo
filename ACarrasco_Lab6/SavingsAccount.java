
public class SavingsAccount extends BankAccount
{
    private static final double RATE = 0.025; 
    private int savingsNumber;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.savingsNumber = 0;
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount original, double amount) {
        super(original, amount);
        this.savingsNumber = original.savingsNumber + 1; 
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * RATE / 12;
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}
