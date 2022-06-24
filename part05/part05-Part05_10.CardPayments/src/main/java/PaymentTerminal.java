public class PaymentTerminal {
    private static final double AFFORDABLE_MEAL_COST = 2.50;
    private static final double HEARTY_MEAL_COST = 4.30;

    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double change = payment - AFFORDABLE_MEAL_COST;
 
        if(change >= 0) {
            this.money += AFFORDABLE_MEAL_COST;
            this.affordableMeals++;
            return change;
        }
 
        return payment;
    }

    public double eatHeartily(double payment) {
        double change = payment - HEARTY_MEAL_COST;
 
        if(change >= 0) {
            this.money += HEARTY_MEAL_COST;
            this.heartyMeals++;
            return change;
        }
 
        return payment;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}