public class Timer {
    private ClockHand centiSeconds;
    private ClockHand seconds;

    public Timer() {
        this.centiSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.centiSeconds.advance();
        if(this.centiSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.centiSeconds;
    }
}