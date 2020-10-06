package Day08;

public class CurrentAccount extends Account {
    private double fee;

    public CurrentAccount(int ID, double balance, double fee) {
        super(ID, balance);
        this.fee = fee;
    }

    public void clearCheck(double amount) {
        deduct(amount + fee);
    }

    @Override
    public double monthlyInterest() {
        return 0;
    }
}
