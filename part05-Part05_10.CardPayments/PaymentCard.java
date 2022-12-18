public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double amount) {
        this.balance += amount;
    }

    public boolean takeMoney(double amount) {
        if(this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}