import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double gpa;
        
        System.out.print("Enter Q1 grade: ");
        double q1 = scan.nextInt();
        
        System.out.print("Enter Q2 grade: ");
        double q2 = scan.nextInt();
        
        gpa = (q1 + q2) / 2;
        System.out.println("\nGPA: " + gpa);
        
        // This line of if statments sifts through the grades
        // instead of having to find the high and low, just lower the comparison until a match is found
        if (gpa >= 90){
            System.out.println("Grade: A");
        }
        else if (gpa >= 80){
            System.out.println("Grade: B");
        }
        else if (gpa >= 70){
            System.out.println("Grade: C");
        }
        else if (gpa >= 65){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}