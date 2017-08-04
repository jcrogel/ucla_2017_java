package edu.ucla.ex.java.summer.bakery.cookie;


import edu.ucla.ex.java.summer.bakery.kitchen.CookieCutter;
import edu.ucla.ex.java.summer.bakery.pantry.Ingredient;

public class Macaron extends Cookie {
    public Macaron(Ingredient ingredients[], CookieCutter cut){
        super(ingredients, cut);
    }

    public boolean decorate(){
        return true;
    }
}
