import java.util.Scanner;

public class Sales{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sales people?");
        System.out.print("int: ");

        int SALESPEOPLE = Math.abs(scan.nextInt());
        int[] sales = new int[SALESPEOPLE];
        int sum;
        double avg;

        int highest = 0;
        int lowest = 0;
        int highestSales = 0;
        int lowestSales = 999999;

        for (int i = 0; i < sales.length; i++){
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        for (int i = 0; i < sales.length; i++){
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];

            if (sales[i] > highestSales){
                highestSales = sales[i];
                highest = i+1;
            }

            if (sales[i] < lowestSales){
                lowestSales = sales[i];
                lowest = i+1;
            }
        }
        avg = sum / SALESPEOPLE;

        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sales: " + avg);
        System.out.println("\nSalesperson " + highest + " had the highest sale with $" + highestSales);
        System.out.println("Salesperson " + lowest + " had the lowest sale with $" + lowestSales);
        
        System.out.println();
        System.out.println("Enter a value to find every salesperson who exceeded that value");
        System.out.print("int: ");
        int sift = scan.nextInt();
        
        for (int i = 0; i < sales.length; i++){
            if (sales[i] >= sift){
                System.out.println("Salesperson " + (i+1) + " had $" + sales[i]);
            }
        }
    }
}