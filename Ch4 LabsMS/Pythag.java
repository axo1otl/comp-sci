// Matheus Sekiguchi
// September 28, 2022
// Use Math methods to find the hyp of a triangle

import java.util.Scanner;
public class Pythag{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the adj and opp sides of the triangle");
        
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        
        System.out.println("The hyp is: " + Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2)));
    }
}