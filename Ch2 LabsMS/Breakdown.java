import java.util.Scanner;
public class Breakdown{
    public static void main(String[] args){
        double userAmt, cents;
        double d100, d50, d20, d10, d5, d1, quarter, dime, nickel, penny;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("How much money do you need converted? ");
        userAmt = scan.nextDouble();
        
        
        d100 = (int)userAmt / 100;
        userAmt = userAmt % 100;
        
        d50 = (int)userAmt / 50;
        userAmt = userAmt % 50;
        
        d20 = (int)userAmt / 20;
        userAmt = userAmt % 20;
        
        d10 = (int)userAmt / 10;
        userAmt = userAmt % 10;
        
        d5 = (int)userAmt / 5;
        userAmt = userAmt % 5;
        
        d1 = (int)userAmt / 1;
        userAmt = userAmt % 1;
        
        cents = userAmt * 100;
        cents = (int)cents;
        cents = cents / 100;
        
        quarter = cents * 4;
        quarter = (int)quarter;
        cents = cents % 0.25;
        
        dime = cents * 10;
        dime = (int)dime;
        cents = cents % 0.10;
        
        nickel = cents * 20;
        nickel = (int)nickel;
        cents = cents % 0.05;
        
        penny = cents * 100;
        penny = (int)penny;
        cents = cents % 0.01;
        
        System.out.println("");
        
        System.out.println((int)d100 + " hundred dollar bills");
        System.out.println((int)d50 + " fifty dollar bills");
        System.out.println((int)d20 + " twenty dollar bills");
        System.out.println((int)d10 + " ten dollar bills");
        System.out.println((int)d5 + " five dollar bills");
        System.out.println((int)d1 + " one dollar bills");
        System.out.println((int)quarter + " quarters");
        System.out.println((int)dime + " dimes");
        System.out.println((int)nickel + " nickels");
        System.out.println((int)penny + " pennies");
        
    }
}
