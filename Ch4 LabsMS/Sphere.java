// Matheus Sekiguchi
// September 28, 2022
// Use Math methods to find the area and volume of a sphere

import java.util.Scanner;
public class Sphere{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a radius: ");
        
        double radius = scan.nextDouble();
        double volume, area;
        double pi = Math.PI;
        
        // answer for r = 4 should be 268.08
        volume = pi * Math.pow(radius,3) / 3 * 4;
        System.out.println("\nVolume: " + volume);
        
        //annswer for r = 4 should be 201.06
        area = pi * Math.pow(radius,2) * 4;
        System.out.println("Surface area: " + area);
    }
}