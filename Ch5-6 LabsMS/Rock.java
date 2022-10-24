import java.util.Scanner;
public class Rock{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String personPlay;   //User's play -- "R", "P", or "S"
        String computerPlay; //Computer's play -- "R", "P", or "S"
        int computerInt;     //Randomly generated number used to
                             //determine computer's play
        int again = 1;
        String againStr;
        
        while (again == 1){
            //Get player's play -- note that this is stored as a string
            System.out.println("Enter your play");
            System.out.print("R / P / S: ");
            personPlay = scan.next();
        
            //Make player's play uppercase for ease of comparison
            personPlay = personPlay.toUpperCase();
        
            //Generate computer's play (0,1,2)
            computerInt = (int) (Math.random() * 3);

            //Translate computer's randomly generated play to string
            if (computerInt == 0){
                computerPlay = "R";
            }
            else if (computerInt == 1){
                computerPlay = "P";
            }
            else{
                computerPlay = "S";
            }
            //Print computer's play
            System.out.println("Computer play is " + computerPlay);
        
            //See who won. Use nested ifs instead of &&.
            if (personPlay.equals(computerPlay)){
                System.out.println("It's a tie!");
            }
            else if (personPlay.equals("R")){
                if (computerPlay.equals("S")){
                    System.out.println("Rock crushes scissors. You win!!");
                }
                else{
                    System.out.println("Paper covers rock. You lose.");
                }
            }
            else if (personPlay.equals("P")){
                if (computerPlay.equals("R")){
                    System.out.println("Paper covers rock. You win!!");
                }
                else{
                    System.out.println("Scissors cuts paper. You lose.");
                }
            }
            else if (personPlay.equals("S")){
                if (computerPlay.equals("P")){
                    System.out.println("Scissors cuts paper. You win!!");
                }
                else{
                    System.out.println("Rock crushes scissors. You lose.");
                }
            }
            else{
                System.out.println("You didn't make a move. You lose.");
            }
            System.out.println("Play again?\ny/n");
            againStr = scan.next();
            againStr = againStr.toUpperCase();
            if (!(againStr.equals("Y"))){
                again = 0;
            }
        }
    }
}
