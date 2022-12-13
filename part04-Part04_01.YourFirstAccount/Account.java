public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double saldo() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}