package edu.ucla.ex.java.summer.bakery.cookie;

import edu.ucla.ex.java.summer.bakery.kitchen.CookieCutter;
import edu.ucla.ex.java.summer.bakery.pantry.Chocolate;
import edu.ucla.ex.java.summer.bakery.pantry.Ingredient;

public class Oreo extends Cookie implements Chocolate {
    public Oreo(Ingredient ingredients[], CookieCutter cut){
        super(ingredients, cut);
    }

    public boolean decorate(){
        return false;
    }
}
