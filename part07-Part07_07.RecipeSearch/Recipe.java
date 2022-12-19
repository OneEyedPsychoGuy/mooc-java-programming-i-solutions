import java.util.List;

public class Recipe {
    private String name;
    private int cookingTime;
    private List<String> ingredients;

    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public boolean containsName(String name) {
        return this.name.contains(name);
    }

    public boolean isLessThanOrEqualToCookingTime(int maxCookingTime) {
        return this.cookingTime <= maxCookingTime;
    }

    public boolean containsIngredient(String ingredient) {
        return this.ingredients.contains(ingredient);
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}