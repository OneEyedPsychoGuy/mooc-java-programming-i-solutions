public class Printer {
    public static void main(String[] args) {}

    public static void printArrayInStars(int[] array) {
        for(int num : array) {
            for(int stars = 0; stars < num; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}