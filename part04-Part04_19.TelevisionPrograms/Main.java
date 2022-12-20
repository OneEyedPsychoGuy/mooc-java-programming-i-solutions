import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TelevisionProgram> programs = new ArrayList<>();

        while(true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
        
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
        
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.println();

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        scanner.close();
        
        for(TelevisionProgram program : programs) {
            if(program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}