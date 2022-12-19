import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private List<Recipe> recipes;
    private Scanner keyboard;

    public UserInterface() {
        this.recipes = new ArrayList<>();
        this.keyboard = new Scanner(System.in);
    }

    public void start() {
        this.processRecipes();
        this.menu();

        while(true) {
            System.out.print("Enter command: ");
            String command = this.keyboard.nextLine();
            if(command.equals("stop")) break;
            this.processCommand(command);
            System.out.println();
        }
    }

    private void processRecipes() {
        try(Scanner fileReader = new Scanner(this.requestFileToRead())) {
            while(fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                while(fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if(ingredient.isEmpty()) break;
                    ingredients.add(ingredient);
                }

                this.recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Path requestFileToRead() {
        String file = "";
        while(true) {
            System.out.print("File to read: ");
            file = this.keyboard.nextLine();
            System.out.println();

            if(this.isValidFile(file)) {
                break;
            }

            System.out.println("File does not exist or is not readable\n");
        }
        return Paths.get(file);
    }

    private boolean isValidFile(String file) {
        final Path path = Paths.get(file);
        if(Files.exists(path) && Files.isReadable(path)) {
            return true;
        }
        return false;
    }

    private void menu() {
        System.out.println(
            "Commands:\n" +
            "list - lists the recipes\n" +
            "stop - stops the program\n" +
            "find name - searches recipes by name\n" +
            "find cooking time - searches recipes by cooking time\n" +
            "find ingredient - searches recipes by ingredient\n"
        );
    }

    private void processCommand(String command) {
        switch(command) {
            case "list":
                this.listRecipes();
                break;
            case "find name":
                this.findRecipesByName();
                break;
            case "find cooking time":
                this.findRecipesByCookingTime();
                break;
            case "find ingredient":
                this.findRecipesByIngredient();
                break;
            default:
                System.out.println("\nUnknown command");
        }
    }

    private void listRecipes() {
        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    private void findRecipesByName() {
        System.out.print("Searched word: ");
        String name = this.keyboard.nextLine();

        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes) {
            if(recipe.containsName(name)) {
                System.out.println(recipe);
            }
        }
    }

    private void findRecipesByCookingTime() {
        System.out.print("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(this.keyboard.nextLine());

        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes) {
            if(recipe.isLessThanOrEqualToCookingTime(maxCookingTime)) {
                System.out.println(recipe);
            }
        }
    }

    private void findRecipesByIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = this.keyboard.nextLine();

        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes) {
            if(recipe.containsIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}