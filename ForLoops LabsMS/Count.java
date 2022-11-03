import java.util.Scanner;
public class Count{
    public static void main (String[] args){
        boolean loop = true;
        String phrase = " ";  // a string of characters
        int countBlank, countA, countE, countS, countT;   // the number of blanks (spaces) in the phrase
        int length = 0;       // the length of the phrase
        char ch = ' ';        // an individual character in the string

        Scanner scan = new Scanner(System.in);
        
        // Print a program header
        System.out.println();
        System.out.println("Character Counter");
        
        while (loop){        
            // Read in a string and find its length
            System.out.println();
            System.out.print("Enter a sentence or phrase: ");
            phrase = scan.nextLine();
            length = phrase.length();
        
            // Initialize counts
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;
        
            phrase = phrase.toLowerCase();
        
            // a for loop to go through the string character by character
            // and count the blank spaces
            for (int x = 0; x < length; x++){
                if (phrase.substring(x, x + 1).equals(" ")){
                    countBlank++;
                }
                if (phrase.substring(x, x + 1).equals("a")){
                    countA++;
                }
                if (phrase.substring(x, x + 1).equals("e")){
                    countE++;
                }
                if (phrase.substring(x, x + 1).equals("s")){
                    countS++;
                }
                if (phrase.substring(x, x + 1).equals("t")){
                    countT++;
                }
            }
        
            // Print the results
            System.out.println();
            System.out.println("Number of blank spaces: " + countBlank);
            System.out.println("Number of A characters: " + countA);
            System.out.println("Number of E characters: " + countE);
            System.out.println("Number of S characters: " + countS);
            System.out.println("Number of T characters: " + countT);
            System.out.println();
            System.out.println("Type in a new phrase or type \"quit\" to quit");
            if (scan.next().equals("quit")){
                loop = false;
            }
        }
    }
}