public class Main {
    public static void main(String[] args) {
        Gauge gauge = new Gauge();

        while(!gauge.full()) {
            System.out.println("Not full! Value: " + gauge.value());
            gauge.increase();
        }

        System.out.println("Full! Value: " + gauge.value());
        gauge.decrease();
        System.out.println("Not full! Value: " + gauge.value());
    }
}