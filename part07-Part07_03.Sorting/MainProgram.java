public class MainProgram {
    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int num : array) {
            if(num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int start) {
        int smallestIndex = start;
        for(int i = start; i < array.length; i++) {
            if(array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestIndex);
        }
    }
}