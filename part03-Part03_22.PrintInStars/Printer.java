public class Printer {
    public static void printArrayInStars(int[] array) {
        for(int stars : array) {
            while(stars > 0) {
                System.out.print("*");
                stars--;
            }
            System.out.println();
        }
    }
}