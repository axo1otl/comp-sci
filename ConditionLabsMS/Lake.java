import java.util.Scanner;

public class Lake{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int temp;
        
        System.out.print("Enter outside temp: ");
        temp = scan.nextInt();
        
        if (temp >= 80){
            System.out.println("Try swimming!");
        }
        else if (temp >= 60){
            System.out.println("Try tennis!");
        }
        else if (temp >= 40){
            System.out.println("Try golf!");
        }
        else if (temp < 40){
            System.out.println("Try skiing!");
        }
        else{
            System.out.println("error");
        }
        if (temp > 95 || temp <= 20){
            System.out.println("Visit our shops!");
        }
    }
}