import java.util.Scanner;
public class BaseConvert {
    public static void main (String[] args) {
        int base;       // the new base
        int place0;     // digit in the 1's (base^0) place
        int place1;     // digit in the base^1 place
        int place2;     // digit in the base^2 place
        int place3;     // digit in the base^3 place
        int quotient;   // quotient when dividing by the base
        int base10Num;  // the number in base 10
        int maxNumber;  // the maximum number that will fit in 4 digits in the new base
        
        Scanner scan = new Scanner(System.in);
        String baseBNum = new String (""); // the number in the new base
        System.out.print("Enter a base from 2 to 9: ");
        base = scan.nextInt();// read in the base 10 number and the base
        maxNumber = base * base * base * base - 1;// Compute the maximum base 10 number that will fit in 4 digits
        // in the new base and tell the user what range the number they
        // want to convert must be in
        System.out.println("The maximum nummber with base" + base + " is " + maxNumber);
        System.out.print("Enter a number from 0 to " + maxNumber + " in base10: ");
        // Do the conversion (see notes in lab)
        base10Num = scan.nextInt();
        
        place0 = base10Num % base;
        quotient = base10Num / base;
        
        place1 = quotient % base;
        quotient = quotient / base;
        
        place2 = quotient % base;
        quotient = quotient / base;
        
        place3 = quotient % base;
        quotient = quotient / base;
        
        // Print the result (see notes in lab)
        System.out.println("The result in base" + base + " is " + place3 + place2 + place1 + place0);
    }
}