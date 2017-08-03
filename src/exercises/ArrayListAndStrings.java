package exercises;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListAndStrings {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Alice");
        words.add("was");
        words.add("beginning");
        words.add("to");
        words.add("get");
        words.add("very");
        words.add("tired");
        words.add("of");
        words.add("sitting");

        for(String word: words){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }


}
