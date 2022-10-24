import java.util.Scanner;
public class MathPractice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter 2 negative number, one int and one double");
        
        int num1 = scan.nextInt();
        double num2 = scan.nextDouble();
        double num3 = 30;
        
        System.out.println("The int absolute is: " + Math.abs(num1));
        System.out.println("The double absolute is: " + Math.abs(num2));
        
        System.out.println("The square root is: " + Math.sqrt(Math.abs(num1)));
        
        System.out.println("The cube root is: " + Math.pow(num1,3));
        
        System.out.println("Pi is: " + Math.PI);
        
        System.out.println("The Max is: " + Math.max(Math.max(num1,num2),num3));
    }
}