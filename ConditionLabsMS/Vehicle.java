import java.util.Scanner;

public class Vehicle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int type;
        double comm = 0;
        
        System.out.println("Enter the number of doors");
        System.out.print("2 / 4: ");
        int doors = scan.nextInt();
        
        if (doors == 2){
            System.out.println("\nEnter vehicle type");
            System.out.print("sport = 0 / coupe = 1: ");
            type = scan.nextInt();
            
            if (type == 0){
                comm = 3.0;
            }
            else if (type == 1){
                comm = 1.0;
            }
            else{
                System.out.println("\n\n\nERROR: Please enter valid car type!");
            }
        }
        else if (doors == 4){
            System.out.println("\nEnter vehicle type");
            System.out.print("SUV = 0 / sedan = 1: ");
            type = scan.nextInt();
            
            if (type == 0){
                comm = 2.0;
            }
            else if (type == 1){
                comm = 1.5;
            }
            else{
                System.out.println("\n\n\nERROR: Please enter valid car type!");
            }
        }
        else{
            System.out.println("\n\n\nERROR: Please enter valid door count!");
        }
        System.out.println("\n\n\nYour commission is: " + comm + "%");
    }
}