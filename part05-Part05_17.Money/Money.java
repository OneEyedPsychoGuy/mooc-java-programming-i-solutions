public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if(cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money money) {
        return new Money(this.euros + money.euros, this.cents + money.cents);
    }

    public Money minus(Money money) {
        int euros = this.euros - money.euros;
        int cents = this.cents - money.cents;
 
        if(cents < 0) {
            cents += 100;
            euros--;
        }
 
        if(euros < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euros, cents);
    }

    public boolean lessThan(Money money) {
        return (100 * this.euros + this.cents) < (100 * money.euros + money.cents);
    }

    @Override
    public String toString() {
        return this.euros + "." + (this.cents < 10 ? "0" : "") + this.cents + "e";
    }
}