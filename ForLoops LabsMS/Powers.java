import java.util.Scanner;

public class Powers{
    public static void main(String[] args){
        int numPowersOf2; //How many powers of 2 to compute
        int nextPowerOf2 = 1; //Current power of 2

        Scanner scan = new Scanner(System.in);
        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        
        //print a message saying how many powers of 2 will be printed
        System.out.println("The first " + numPowersOf2 + " powers of 2 are: ");
        
        //initialize exponent--
        //the first thing printed is 2 to the what?
        nextPowerOf2 = 1;
        for(int x = 1; x <= numPowersOf2; x++){
            //print out the current power of 2
            System.out.println("2^" + x + " =\t" + nextPowerOf2);
            //find next power of 2--
            //how do you get this from the last one
            nextPowerOf2 = 1;
            for (int i = 1; i <= x; i++){
                nextPowerOf2 *= 2;
            }
        }
    }
}