// Matheus Sekiguchi
// Sept 29, 2022
// Solve the quadratic formula

import java.util.Scanner;

public class Quadratic{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a,b,c;
        double answer;
        
        System.out.println("Enter your values");
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        answer = -b + Math.sqrt(Math.pow(b,2) - (4 * a * c));
        answer = answer / (2 * a);
        System.out.println("Your answer is: " + answer);
    }
}