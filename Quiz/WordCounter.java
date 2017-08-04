/*
Add Authors here for grading

*/

import java.io.FileReader;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;



public class WordCounter {

    public Hashtable count_words(String contents){
        Hashtable count = new Hashtable();
        // Do work here
        return count;
    }

    public LinkedList top20(Hashtable count)
    {
        // TODO: Return top 20 words on the songs,
        // cleaned up removing special characters ",' and in lowercase
        // For example "A  should be converted to a
        // (singular and plural are ok to have as duplicates)
        // Return value can be an array or LinkedList
        // Each element of the array can be a Hashtable with only one element sorted where the highest element is at the top
        // For example:  [{the=20}, {a=10}, {boy=10}, {news=5}.....]
        // Deadline Aug 17 before the class email to jcrogel@ucla.edu

        return new LinkedList();
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

            LinkedList top20 = wc.top20(count);
            for (Object item: top20)
            {
                System.out.println(item);
            }

        } catch (Exception e){
            System.err.println("Error " + e.getMessage());
        }
    }
}
