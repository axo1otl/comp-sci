/**
* Programmer: Matheus Sekiguchi
* Date: Sep 25 - 26, 2022
* StringMutation works with string methods, printing length, 1st half, 2nd half, middle 3
* characters, switch 1st & 2nd halfs, replace a character, use compareTo & equals
* Strings are immutable so need new variables to store modified versions of strings
*/

public class StringMutation {
    public static void main(String[] args) {
        String myString = new String("This is a test String.");
        String myString2 = "This is a second test String.";
        int phraseLength, middleIndex;
        String firstHalf, secondHalf, switchPhrase, middle3;
        
        //manipulation of myString (If you would like more practice, repeat for myString2)
        //determine and store length
        phraseLength = myString.length();
        
        //find and store middleIndex
        middleIndex = phraseLength / 2;
        
        //store first half
        firstHalf = myString.substring(0, middleIndex);
        
        //store second half (can be done 2 ways)
        secondHalf = myString.substring(middleIndex, phraseLength);
        
        //place first half at end of second half
        switchPhrase = secondHalf + firstHalf;
        
        //find the middle 3 characters
        middle3 = "" + (myString.charAt(middleIndex - 1)) + (myString.charAt(middleIndex)) + (myString.charAt(middleIndex + 1));
        
        //print the following:
        
        //original phrase
        System.out.println(myString);
        
        //length of phrase
        System.out.println(phraseLength);
        
        //middle index
        System.out.println(middleIndex);
        
        //character at middle index
        System.out.println(myString.charAt(middleIndex));
        
        //replace all spaces with @
        System.out.println(myString.replace(' ', '@'));
        
        //switched string (secondHalf firstHalf)
        System.out.println(switchPhrase);
        
        //use equals( ) to determine equality of string phrases
        System.out.println(myString.equals(myString2));
        
        //use compareTo( ) to determine which comes first alphabetically
        System.out.println(myString.compareTo(myString2));
    }
}