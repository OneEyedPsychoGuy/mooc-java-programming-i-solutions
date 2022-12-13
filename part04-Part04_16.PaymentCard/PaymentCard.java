public class PaymentCard {
    private static final double AFFORDABLE = 2.6;
    private static final double HEARTY = 4.6;
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if(this.balance >= AFFORDABLE) {
            this.balance -= AFFORDABLE;
        }
    }
 
    public void eatHeartily() {
        if(this.balance >= HEARTY) {
            this.balance -= HEARTY;
        }
    }

    public void addMoney(double amount) {
        if(amount < 0) {
            return;
        }
 
        this.balance += amount;
        if(this.balance > 150) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}