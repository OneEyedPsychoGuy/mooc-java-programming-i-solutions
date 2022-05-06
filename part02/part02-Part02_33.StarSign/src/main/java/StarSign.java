public class StarSign {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int number) {
        while(number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }
}