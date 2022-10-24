import java.util.Scanner;

public class Username{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        char first;
        String last;
        int num = (int)(Math.random() * 99) + 1;
        
        System.out.print("Enter your first name: ");
        first = scan.next().charAt(0);
        
        System.out.print("Enter your last name: ");
        last = scan.next().substring(0,5);
        
        System.out.println("Your username is: " + first + last + num);
    }
}