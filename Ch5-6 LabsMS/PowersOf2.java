import java.util.Scanner;

public class PowersOf2{
    public static void main(String[] args){
        int numPowersOf2; //How many powers of 2 to compute
        int nextPowerOf2 = 1; //Current power of 2
        int exponent = 0; //Exponent for current power of 2 --
                      //this also servers as a counter for the loop
        Scanner scan = new Scanner(System.in);
        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        
        //print a message saying how many powers of 2 will be printed
        System.out.println("The first " + numPowersOf2 + " powers of 2 are: ");
        
        //initialize exponent--
        //the first thing printed is 2 to the what?
        exponent += 0;
        nextPowerOf2 = (int)Math.pow(2,exponent);
        while(exponent < numPowersOf2){
            //print out the current power of 2
            System.out.println("2^" + exponent + " =\t" + nextPowerOf2);
            
            //increment exponent
            exponent += 1;
            
            //find next power of 2--
            //how do you get this from the last one
            nextPowerOf2 = (int)Math.pow(2,exponent);
        }
    }
}