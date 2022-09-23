import java.util.Scanner;

public class IdealWieght {
    public static void main(String[] args) {
        int hFeet, hInch, hInchOver;
        int gender;
        int idealWeight = 0;
        int rangeLo = 0, rangeHi = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How tall are you?");
        System.out.print("Feet: ");
        hFeet = scan.nextInt();
        System.out.print("Inches: ");
        hInch = scan.nextInt();
        
        System.out.println("What is your gender?");
        System.out.print("M = 0 / F = 1: ");
        gender = scan.nextInt();
        
        hInchOver = (hFeet - 5) * 12 + hInch;
        
        if (gender == 0) {
            idealWeight = 106 + (hInchOver * 6);
        }
        if (gender == 1) {
            idealWeight = 100 + (hInchOver * 5);
        }
        
        rangeLo = idealWeight - (idealWeight / 100 * 15);
        rangeHi = idealWeight + (idealWeight / 100 * 15);
        
        System.out.println("Your ideal weight is " + idealWeight);
        System.out.println("But aim for somewhere between " + rangeLo + " and " + rangeHi);
    }
}