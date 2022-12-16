public class ArrayPrinter {
    public static void printNeatly(int[] array) {
        String string = "";
        for(int i = 0; i < array.length - 1; i++) {
            string += array[i] + ", ";
        }
        System.out.println(string += array[array.length - 1]);
    }
}