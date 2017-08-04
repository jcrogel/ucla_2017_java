package edu.ucla.ex.java.summer.bakery.cookie;

import java.util.*;
import edu.ucla.ex.java.summer.bakery.pantry.*;
import edu.ucla.ex.java.summer.bakery.kitchen.*;


public abstract class Cookie {
    private Shape shape;
    protected Ingredient ingredients[];
    public String flavor_name;
    public Oven oven;

    public Cookie(Ingredient new_ingredients[], CookieCutter cutter){
        oven = Oven.singletonInstance();
        this.ingredients = new_ingredients;
        this.mix();
        this.shape = cutter.cut();
        this.bake();
    }

    public Cookie(){

    }

    public void mix() {
        int times = 5;
        for (int fold = 0; fold < times; fold++) {
            Random rand = new Random();
            for (int i = 0; i < this.ingredients.length; i++) {
                int random_element = rand.nextInt(100) % this.ingredients.length;
                Ingredient to_swap = this.ingredients[i];
                this.ingredients[i] = this.ingredients[random_element];
                this.ingredients[random_element] = to_swap;
            }
        }
    }

    public void bake(){
        while(oven.temperature == 400) {
            try {
                Thread.sleep(50000);
            } catch (Exception e){

            }

            if (oven.check()) {
                break;
            }
        }
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    abstract boolean decorate();
}


