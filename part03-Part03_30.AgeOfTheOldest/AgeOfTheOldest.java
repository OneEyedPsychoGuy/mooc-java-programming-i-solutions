import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            int age = Integer.valueOf(data[1]);
            if(age > oldest) {
                oldest = age;
            }
        }
        scanner.close();

        System.out.println("Age of the oldest: " + oldest);
    }
}