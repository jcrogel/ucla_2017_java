package edu.ucla.ex.java.summer.bakery;

import edu.ucla.ex.java.summer.bakery.cookie.Cookie;
import edu.ucla.ex.java.summer.bakery.kitchen.Oven;

public interface Bakery {
    public Oven bakeryOven = Oven.singletonInstance();

    public Cookie[] order(String cookie[], int quantity []);
}
