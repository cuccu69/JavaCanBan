package Day08;

public abstract class Ticket {
    private int balance;
    private Gate origin;
    private boolean valid = true;

    public Ticket(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public abstract void adjustValue();
    public abstract boolean isValid();

    public void deduct(int amount){
        balance -= amount;
    }

    public void setOrigin(Gate currentGate){
        if (currentGate == null){
            valid = false;
        }
        origin = currentGate;
    }

    public Gate getOrigin() {
        return origin;
    }
}
