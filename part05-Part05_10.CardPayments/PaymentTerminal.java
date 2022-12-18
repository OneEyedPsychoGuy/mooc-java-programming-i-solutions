public class PaymentTerminal {
    private static final double AFFORDABLE_PRICE = 2.50;
    private static final double HEARTY_PRICE = 4.30;
 
    private double money;
    private int affordableMeals;
    private int heartyMeals;
 
    public PaymentTerminal() {
        this.money = 1000;
    }
 
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    public double eatAffordably(double payment) {
        if(payment < AFFORDABLE_PRICE) {
            return payment;
        }

        this.money += AFFORDABLE_PRICE;
        this.affordableMeals++;
        return payment - AFFORDABLE_PRICE;
    }
 
    public boolean eatAffordably(PaymentCard card) {
        boolean paid = card.takeMoney(AFFORDABLE_PRICE);
        if(paid) {
            this.affordableMeals++;
        }
        return paid;
    }
 
    public double eatHeartily(double payment) {
        if(payment < HEARTY_PRICE) {
            return payment;
        }

        this.money += HEARTY_PRICE;
        this.heartyMeals++;
        return payment - HEARTY_PRICE;
    }

    public boolean eatHeartily(PaymentCard card) {
        boolean paid = card.takeMoney(HEARTY_PRICE);
        if(paid) {
            this.heartyMeals++;
        }
        return paid;
    }
 
    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals + ", number of sold hearty meals: " + this.heartyMeals;
    }
}