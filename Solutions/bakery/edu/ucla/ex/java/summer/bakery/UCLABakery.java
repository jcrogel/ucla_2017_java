package edu.ucla.ex.java.summer.bakery;

import java.util.LinkedList;
import edu.ucla.ex.java.summer.bakery.cookie.*;
import edu.ucla.ex.java.summer.bakery.kitchen.CookieCutter;
import edu.ucla.ex.java.summer.bakery.pantry.Ingredient;

public class UCLABakery implements Bakery {
    public Cookie[] push_cookie(Cookie cookie_array[],Cookie new_cookie) {
        Cookie result[] = new Cookie[cookie_array.length + 1];
        for (int x=0; x<cookie_array.length;x++){
            result[x] = cookie_array[x];
        }

        result[cookie_array.length] = new_cookie;
        return result;
    }

    public Cookie[] order(String cookie[], int quantity []){
        // For you guys to do on your own!!!
        // Example of instanciation
        // Ingredient chocingredients[] = {new Ingredient("butter")};
        // new ChocolateChipCookie(chocingredients, new CookieCutter());
        Cookie[] result = new Cookie[0];

        if (cookie.length != quantity.length)
        {
            System.out.println("Sorry I didn't get the right order");
            return new Cookie[0];
        }

        for (int x=0; x<cookie.length;x++)
        {
            String current_item = cookie[x];
            int qty = quantity[x];
            if (current_item == "ChocolateChip")
            {
                Ingredient ingredients[] = {
                                                new Ingredient("butter"),
                                                new Ingredient("dough"),
                                                new Ingredient("milk")
                                            };
                Ingredient chips[] = { new Ingredient("chocolate")};

                CookieCutter cutter = new CookieCutter();
                for( int i=0; i<qty; i++)
                {

                    ChocolateChipCookie c = new ChocolateChipCookie(ingredients, cutter);
                    c.set_chips(chips);
                    result = this.push_cookie(result, c);
                }
            }

            if (current_item == "SnickerDoodle")
            {
                Ingredient ingredients[] = {
                        new Ingredient("butter"),
                        new Ingredient("dough"),
                        new Ingredient("milk"),
                        new Ingredient("cinnamon")
                };

                CookieCutter cutter = new CookieCutter();
                for( int i=0; i<qty; i++)
                {

                    SnickerDoodle c = new SnickerDoodle(ingredients, cutter);
                    result = this.push_cookie(result, c);
                }
            }

            if (current_item == "Macaron")
            {
                Ingredient ingredients[] = {
                        new Ingredient("butter"),
                        new Ingredient("almond_meal"),
                        new Ingredient("eggs"),
                };

                CookieCutter cutter = new CookieCutter();
                for( int i=0; i<qty; i++)
                {

                    Macaron c = new Macaron(ingredients, cutter);
                    result = this.push_cookie(result, c);
                }
            }

            if (current_item == "Oreo")
            {
                Ingredient ingredients[] = {
                        new Ingredient("butter"),
                        new Ingredient("almond_meal"),
                        new Ingredient("eggs"),
                };

                CookieCutter cutter = new CookieCutter();
                for( int i=0; i<qty; i++)
                {

                    Oreo c = new Oreo(ingredients, cutter);
                    result = this.push_cookie(result, c);
                }
            }

        }

        return result;


    }
}
