package edu.ucla.ex.java.summer.bakery.cookie;

import edu.ucla.ex.java.summer.bakery.pantry.*;

public class ChocolateChipCookie extends Cookie implements Chocolate{
    private Ingredient choc_chips[];

    public void mix() {
        super.mix();
        int len = choc_chips.length + this.ingredients;
        Ingredient[] new_ingredients = new Ingredient[len];

        // Add cookies to the end
        for (int i=0; i<len; i++) {
            if (i < this.ingredients.length) {
                new_ingredients[i] = this.ingredients[i];
            } else {
                int choc_index = i - this.ingredients.length;
                new_ingredients[i] = this.choc_chips[choc_index];
            }

        }
    }

}
