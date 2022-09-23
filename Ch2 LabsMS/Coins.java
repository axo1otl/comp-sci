import java.util.Scanner;

public class Coins{
    public static void main(String[] args){
        int quaters;
        int dimes;
        int nickles;
        int pennies;
        double total;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the amount of each coin you have!");
        System.out.print("Quaters: ");
        quaters = scan.nextInt();
        System.out.print("Dimes: ");
        dimes = scan.nextInt();
        System.out.print("Nickles: ");
        nickles = scan.nextInt();
        System.out.print("Pennies: ");
        pennies = scan.nextInt();
        
        total = (quaters * 0.25) + (dimes * 0.10) + (nickles * 0.05) + (pennies * 0.01);
        System.out.println("Your total is: " + total);
    }
}