import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldest = -1;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            int age = Integer.valueOf(data[1]);
            if(age > oldest) {
                oldestName = data[0];
                oldest = age;              
            }
        }

        System.out.println("Name of the oldest: " + oldestName);
        scanner.close();
    }
}