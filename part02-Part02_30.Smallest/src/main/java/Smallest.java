public class Smallest {
    public static void main(String[] args) {
        System.out.println("Smallest: " + smallest(2, 7));
    }

    public static int smallest(int number1, int number2) {
        if(number1 < number2) {
            return number1;
        }
        return number2;
    }
}