public class ClockHand {
    private int limit;
    private int value;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void advance() {
        this.value = this.value + 1;
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}