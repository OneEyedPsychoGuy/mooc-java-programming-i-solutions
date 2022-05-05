public class Greatest {
    public static void main(String[] args) {
        System.out.println("Greatest: " + greatest(2, 7, 3));
    }

    public static int greatest(int number1, int number2, int number3) {
        int greatest = number1;

        if(number2 > greatest) {
            greatest = number2;
        }
        if(number3 > greatest) {
            greatest = number3;
        }

        return greatest;
    }
}