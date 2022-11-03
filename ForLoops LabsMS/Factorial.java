import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int factorial = scan.nextInt();
        int result = 1;
        boolean loop = true;
        
        while (factorial < 0){
            System.out.println("You must enter a non-negative integer!");
            System.out.print("Enter a non-negative integer: ");
            factorial = scan.nextInt();
        }
        if (factorial == 0){
            result = 1;
        }
        else{
            for (int x = factorial; x > 0; x--){
                result *= x;
            }
        }
        System.out.println(result);
    }
}