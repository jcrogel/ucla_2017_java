package edu.ucla.ex.java.summer.bakery.kitchen;

public class Oven {
    public int temperature;
    private static Oven my_oven;

    private Oven(){

    }

    public boolean check(){
        // Yeah do some magic look at cookies and see if they are burnt. Are the cookies ok??
        return true;
    }

    public static Oven singletonInstance(){
        if (my_oven == null)
        {
            my_oven = new Oven();
        }
        return my_oven;
    }
}
