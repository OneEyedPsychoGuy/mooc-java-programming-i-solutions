import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumOfYears = 0;
        int countOfYears = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");            
            if(data[0].length() > longestName.length()) {
                longestName = data[0];
            }
            sumOfYears += Integer.valueOf(data[1]);
            countOfYears++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumOfYears / countOfYears));
        scanner.close();
    }
}