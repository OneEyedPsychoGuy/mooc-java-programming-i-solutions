import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("File? ");
        String file = keyboard.nextLine();
        System.out.print("Lower bound? ");
        int lower = Integer.valueOf(keyboard.nextLine());
        System.out.print("Upper bound? ");
        int upper = Integer.valueOf(keyboard.nextLine());
        keyboard.close();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            int count = 0;
            
            while(fileReader.hasNextLine()) {
                int num = Integer.valueOf(fileReader.nextLine());
                if(num <= upper && num >= lower) {
                    count++;
                }
            }

            System.out.println("Numbers: " + count);
        } catch(IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}