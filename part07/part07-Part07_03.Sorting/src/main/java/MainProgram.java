public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
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
        int index = -1;
        int smallest = array[0];
        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
}