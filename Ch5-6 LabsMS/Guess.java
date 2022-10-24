import java.util.Scanner;
public class Guess{
    public static void main(String[] args){
        int numToGuess; //Number the user tries to guess
        int guess; //The user's guess
        int tries;
        int guessLow, guessHigh;
        boolean play = true;
        int playAgain;
        Scanner scan = new Scanner(System.in);
        while (play == true){
            guessLow = 0;
            guessHigh = 0;
            tries = 0;
            
            //randomly generate the number to guess
            numToGuess = (int)(Math.random() * 20) + 1;
        
            //print message asking user to enter a guess
            System.out.println("Enter a number from 1 to 20");
            
            //read in guess
            guess = scan.nextInt();
            tries += 1;
            while (!(guess == numToGuess)){ //keep going as long as the guess is wrong
            //print message saying guess is wrong
            System.out.println("Incorrect...");
            if (guess > numToGuess){
                System.out.println("Lower");
                guessHigh += 1;
            }
            else{
                System.out.println("Higher");
                guessLow += 1;
            }
            //get another guess from the user
            System.out.println("\nEnter a new number from 1 to 20");
            guess = scan.nextInt();
            tries += 1;
            }
            //print message saying guess is right
            System.out.println("Correct!");
            System.out.println("\nYou guessed it in " + tries + " tries!");
            System.out.println("Low guesses: " + guessLow + "\nHigh guesses: " + guessHigh);
            System.out.println("\n\nPlay again? \n1 = y / 0 = n");
            playAgain = scan.nextInt();
            if (playAgain == 1){
                play = true;
            }
            else{
                play = false;
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
}