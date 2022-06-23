public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        double finalAmount = this.balance - amount;
        if(finalAmount >= 0) {
            this.balance = finalAmount;
            return true;
        }
        return false;
    }
}