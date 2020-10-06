package Day08;

public abstract class Account {
    private int ID;
    private double balance;

    public Account(int ID, double balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public abstract double monthlyInterest();

    public void deposit(double amount){
        balance += amount;
    }

    public void deduct(double amount){
        if(balance < amount){
            throw new IllegalArgumentException("So du khong du");
        } else {
            balance -= amount;
        }
    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }
}
