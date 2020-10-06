package Day08;

public class SavingAccount extends Account{
    private double annualInterest;
    private final int MONTH_IN_YEAR = 12;

    public SavingAccount(int id, double balance, double annualInterest){
        super(id, balance);
        this.annualInterest = annualInterest;
    }

    @Override
    public double monthlyInterest() {
        return getBalance() * annualInterest / MONTH_IN_YEAR;
    }
}
