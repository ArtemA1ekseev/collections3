package ProductRecipe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class RecipeList {
    private final Map<Recipe, Integer> recipe = new HashMap<>();

    public Map<Recipe, Integer> getRecipes() {
        return recipe;
    }

    public void addRecipes(Recipe recipe, Integer integer) {
        this.recipe.put(recipe, (int) recipe.getRecipePrice());
    }

    public void printRecipes() {
        Set<Map.Entry<Recipe,Integer>> printRecip = recipe.entrySet();
        for (Map.Entry<Recipe, Integer> recipEntry : printRecip) {
            System.out.print(recipEntry.getKey());
            System.out.println("Итого " + recipEntry.getValue() + " рублей");
        }
    }
}
