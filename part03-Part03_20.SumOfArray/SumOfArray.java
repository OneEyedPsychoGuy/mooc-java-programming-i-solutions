public class SumOfArray {
    public static void main(String[] args) {}

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }
}