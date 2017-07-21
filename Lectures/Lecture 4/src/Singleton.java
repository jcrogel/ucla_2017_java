/**
 * Created by moreno on 7/20/17.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getOrCreateSingleton(){
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String args[]){
        Singleton s1 = Singleton.getOrCreateSingleton();

        Singleton s2 = Singleton.getOrCreateSingleton();

        System.out.println(s2 == s1);
        System.out.println(instance + ", " + s1 + ", "  + s2);

    }
}
