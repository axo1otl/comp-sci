// Matheus Sekiguchi
// Sept 29, 2022
// Solve for the area of a triangle using heron's formula

import java.util.Scanner;

public class Heron{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double a,b,c,s;
        double answer;
        
        System.out.println("Enter your values");
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        s = (a + b + c) / 2; // semi-perimiter

        answer = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Your answer is: " + answer);
    }
}