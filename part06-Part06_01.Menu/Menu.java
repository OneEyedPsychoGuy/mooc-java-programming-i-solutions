import java.util.List;
import java.util.ArrayList;

public class Menu {
    private List<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if(!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for(String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}