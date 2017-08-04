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
            if (cookie instanceof Cookie) {
                System.out.println(cookie.getClass().getName());
            }
        }
    }
}
