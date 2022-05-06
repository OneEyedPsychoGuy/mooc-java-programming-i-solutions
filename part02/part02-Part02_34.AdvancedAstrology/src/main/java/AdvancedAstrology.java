public class AdvancedAstrology {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printStars(int number) {
        while(number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while(number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }
}