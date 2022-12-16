public class AdvancedAstrology {
    public static void printStars(int stars) {
        while(stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println();
    }

    public static void printSpaces(int spaces) {
        while(spaces > 0) {
            System.out.print(" ");
            spaces--;
        }
    }

    public static void printTriangle(int side) {
        for(int i = 1; i <= side; i++) {
            printSpaces(side - i);
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