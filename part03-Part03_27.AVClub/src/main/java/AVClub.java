import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String answer = scanner.nextLine();
            if(answer.equals("")) {
                break;
            }

            String[] words = answer.split(" ");
            for(String word : words) {
                if(word.contains("av")) {
                    System.out.println(word);
                }
            }
        }

        scanner.close();
    }
}