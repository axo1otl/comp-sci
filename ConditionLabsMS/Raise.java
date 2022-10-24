import java.util.Scanner;
public class Raise{
    public static void main (String[] args){
        double currentSalary; // employee's current salary
        double raise;
        // amount of the raise
        double newSalary;
        int rating;
        // new salary for the employee
        // performance rating
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (1 - 10): ");
        rating = scan.nextInt();
        // Compute the raise using if ...
        if (rating > 6){
            raise = currentSalary * 0.06;
        }
        else if (rating > 3){
            raise = currentSalary * 0.04;
        }
        else{
            raise = currentSalary * 0.015;
        }

        newSalary = currentSalary + raise;
        // Print the results
        System.out.println();
        System.out.println("Current Salary: " + currentSalary);
        System.out.println("Amount of your raise: " + raise);
        System.out.println("Your new salary: " + newSalary);
        System.out.println();
    }
}