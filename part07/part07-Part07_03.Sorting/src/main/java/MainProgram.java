import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));
        
        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));
        
        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
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

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
}