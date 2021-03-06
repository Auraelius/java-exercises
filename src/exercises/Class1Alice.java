package exercises;

import java.util.Scanner;

public class Class1Alice {

    public static void main(String[] args) {
        String searchString;
        String quote ="Class1Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Class1Alice 'without pictures or conversation?'";
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What are you looking for? : ");
        searchString = in.next();

//      adapted from http://docs.oracle.com/javase/tutorial/java/data/comparestrings.html

        int quoteLength = quote.length();
        int searchStringLength = searchString.length();
        boolean foundIt = false;

        for (int i = 0; i <= (quoteLength - searchStringLength); i++) {
            if (quote.regionMatches(true,i, searchString, 0, searchStringLength)) {
                foundIt = true;
                System.out.println(quote.substring(i, i + searchStringLength));
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found it.");
        } else {
            System.out.println("No match found.");
        }
    }
}
