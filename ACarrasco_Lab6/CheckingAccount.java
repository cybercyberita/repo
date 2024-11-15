public class CheckingAccount extends BankAccount
{
    private static final double FEE = 0.15;

    public CheckingAccount(String name, double amount) {
        super(name, amount);
        String newAccountNumber = super.getAccountNumber() + "-10";
        setAccountNumber(newAccountNumber);
    }

    @Override
    public boolean withdraw(double amount) {
        double totalAmount = amount + FEE;
        return super.withdraw(totalAmount);
    }
}
