import java.util.Scanner;

public class LoveCS{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = 1, sum = 0;
        
        System.out.println("How much do you love computer science?");
        System.out.print("Enter an int: ");
        int LIMIT = scan.nextInt();
        
        while (count <= LIMIT){
            System.out.println("I love Computer Science!! ");
            count++;
            sum += sum + 1;
        }
        
        count --;
        sum --;
        System.out.println("Printed " + count + " times.");
        System.out.println("Did you know that the sum of all integers from 1 to " + count + " is " + sum + "?");
    }
}