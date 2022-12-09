public class AdvancedAstrology {
    public static void main(String[] args) {
        printTriangle(4);
        System.out.println("");
        christmasTree(4);
        System.out.println("");
        christmasTree(10);
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

    public static void christmasTree(int height) {
        for(int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars((i * 2) - 1);
        }
        for(int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}