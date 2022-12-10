public class Greatest {
    public static void main(String[] args) {}

    public static int greatest(int num1, int num2, int num3) {
        int greatest = num1;

        if(num2 > greatest) {
            greatest = num2;
        }
        if(num3 > greatest) {
            greatest = num3;
        }

        return greatest;
    }
}