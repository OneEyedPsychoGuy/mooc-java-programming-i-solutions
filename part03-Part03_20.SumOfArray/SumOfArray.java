public class SumOfArray {
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }
}