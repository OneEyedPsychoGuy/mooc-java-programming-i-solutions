public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int num : array) {
            if(smallest > num) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        for(int i = startIndex; i < table.length; i++) {
            if(table[index] > table[i]) {
                index = i;
            }
        }
        return index;
    }
}