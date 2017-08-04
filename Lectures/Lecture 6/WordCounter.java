import java.io.FileReader;
import java.util.Hashtable;
import java.util.Scanner;

public class WordCounter {

    public Hashtable count_words(String contents){
        Hashtable count = new Hashtable();
        // Do work here
        return count;
    }


    public static void main(String args[]){
        try{
            String contents = "";
            Scanner in = new Scanner(new FileReader("src/ADayInTheLife.txt"));
            while(in.hasNextLine())
            {
                contents += in.nextLine() + "\n";
            }
            WordCounter wc = new WordCounter();
            Hashtable count = wc.count_words(contents);

            System.out.println(count);

        } catch (Exception e){
            System.err.println("Error " + e.getMessage());
        }
    }
}
