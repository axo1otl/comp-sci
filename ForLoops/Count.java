import java.util.Scanner;
public class Count{
    public static void main (String[] args){
        String phrase;  // a string of characters
        int countBlank; // the number of blanks (spaces) in the phrase
        int length;     // the length of the phrase
        char ch;        // an individual character in the string

        Scanner scan = new Scanner(System.in);
        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();
        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();
        // Initialize counts
        countBlank = 0;
        // a for loop to go through the string character by character
        // and count the blank spaces
        // Print the results
        System.out.println ();
        System.out.println ("Number of blank spaces: " + countBlank);
        System.out.println ();
    }
}