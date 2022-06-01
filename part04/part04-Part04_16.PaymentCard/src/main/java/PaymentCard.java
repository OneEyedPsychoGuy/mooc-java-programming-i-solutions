public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        double post = this.balance - 2.60;
        if(post >= 0) {
            this.balance = post;
        }
    }
 
    public void eatHeartily() {
        double post = this.balance - 4.60;
        if(post >= 0) {
            this.balance = post;
        }
    }

    public void addMoney(double amount) {
        if(amount < 0) {
            return;
        }
 
        double post = this.balance + amount;
        if(post > 150) {
            this.balance = 150;
        } else {
            this.balance = post;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}