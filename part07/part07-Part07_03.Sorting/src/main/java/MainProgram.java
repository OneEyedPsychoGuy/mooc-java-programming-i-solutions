public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
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
        int smallestIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;
        for(int i = startIndex; i < array.length; i++) {
            if(array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestIndex);
        }
    }
}