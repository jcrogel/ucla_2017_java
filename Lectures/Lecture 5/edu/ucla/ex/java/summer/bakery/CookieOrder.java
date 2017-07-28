package edu.ucla.ex.java.summer.bakery;

import edu.ucla.ex.java.summer.bakery.cookie.Cookie;

public class CookieOrder{
    public static void main(String args[]){
        UCLABakery bakery = new UCLABakery();
        String cookie_order[] = {"ChocolateChip", "SnickerDoodle", "Macaron", "Oreo"};
        int quantities[] = {5, 12, 12, 5};
        Cookie cookies[] = bakery.order(cookie_order, quantities);

        // Testing
        for (Cookie cookie : cookies)
        {
            for (int i=0; i<cookie_order; i++){
                String cookie_name = cookie_order[i];
                if (cookie_name == cookie.flavor_name && cookie.getClass() instanceof Cookie){

                    System.out.println(cookie.getClass().getName());
                    break;
                }
            }
        }
    }
}
