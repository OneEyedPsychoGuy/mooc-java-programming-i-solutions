public class StarSign {
    public static void printStars(int stars) {
        while(stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println();
    }

    public static void printSquare(int side) {
        for(int i = 0; i < side; i++) {
            printStars(side);
        }
    }

    public static void printRectangle(int width, int height) {
        for(int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int side) {
        for(int i = 1; i <= side; i++) {
            printStars(i);
        }
    }
}