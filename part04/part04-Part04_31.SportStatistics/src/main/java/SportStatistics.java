import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            int games = 0;

            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.contains(team)) {
                    games++;
                }
            }

            System.out.println("Games: " + games);
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        scanner.close();
    }
}