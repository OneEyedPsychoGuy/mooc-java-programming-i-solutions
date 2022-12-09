public class ArrayPrinter {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String string = "";
        for(int i = 0; i < array.length - 1; i++) {
            string += array[i] + ", ";
        }
        System.out.println(string += array[array.length - 1]);
    }
}