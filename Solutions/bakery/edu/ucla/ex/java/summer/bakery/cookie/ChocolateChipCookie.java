package edu.ucla.ex.java.summer.bakery.cookie;

import edu.ucla.ex.java.summer.bakery.kitchen.CookieCutter;
import edu.ucla.ex.java.summer.bakery.pantry.*;

public class ChocolateChipCookie extends Cookie implements Chocolate{
    public String flavor_name = "ChocolateChip";

    public ChocolateChipCookie(Ingredient ingredients[], CookieCutter cut){
        super(ingredients, cut);
    }


    public void set_chips(Ingredient choc_chips[]) {
        int len = choc_chips.length + this.ingredients.length;
        Ingredient[] new_ingredients = new Ingredient[len];

        // Add cookies to the end
        for (int i=0; i<len; i++) {
            if (i < this.ingredients.length) {
                new_ingredients[i] = this.ingredients[i];
            } else {
                int choc_index = i - this.ingredients.length;
                new_ingredients[i] = choc_chips[choc_index];
            }

        }
    }


    public boolean decorate(){
        return true;
    }
}
