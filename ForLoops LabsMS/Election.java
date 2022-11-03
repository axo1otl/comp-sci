import java.util.Scanner;
public class Election{
    public static void main (String[] args){
        int votesForPolly; // number of votes for Polly in each precinct
        int votesForErnest; // number of votes for Ernest in each precinct
        int totalPolly = 0; // running total of votes for Polly
        int totalErnest = 0; // running total of votes for Ernest
        String response; // answer (y or n) to the "more precincts" question
        boolean loop = true;
        String precWin = "";
        int precWinPolly = 0;
        int precWinErnest = 0;
        int precTie = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println ();
        System.out.println ("Election Day Vote Counting Program");
        System.out.println ();
        // Initializations
        // Loop to "process" the votes in each precinct
        // Print out the results
        while (loop){
            votesForPolly = 0;
            votesForErnest = 0;
            
            System.out.println ();
            System.out.println("How many votes for Polly?");
            votesForPolly = scan.nextInt();
            System.out.println("How many votes for Ernest?");
            votesForErnest = scan.nextInt();
            
            if (votesForPolly > votesForErnest){
                precWin = precWin + "Polly \n";
                precWinPolly++;
            }
            else if (votesForPolly < votesForErnest){
                precWin = precWin + "Ernest \n";
                precWinErnest++;
            }
            else{
                precWin = precWin + "Tie\n";
                precTie++;
            }
            
            totalPolly += votesForPolly;
            totalErnest += votesForErnest;
            
            System.out.println("Are there more precincts to report?");
            System.out.print("y / n : ");
            response = scan.next().toLowerCase();
            if (response.equals("y")){
                loop = true;
            }
            else {
                loop = false;
            }
        }
        System.out.println ();
        System.out.println("Total votes are...");
        System.out.println("Polly: " + totalPolly);
        System.out.println("Ernest: " + totalErnest);
        System.out.println("\n" + precWin + "\n");
        
        System.out.println("Total precincts are...");
        System.out.println("Polly: " + precWinPolly);
        System.out.println("Ernest: " + precWinErnest);
        System.out.println("Ties: " + precTie);
    }
}
